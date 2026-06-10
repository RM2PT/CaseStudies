package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.EnterItemRequest;
import com.takeout.takeout_system.data.models.*;
import com.takeout.takeout_system.data.repositories.CardPaymentRepository;
import com.takeout.takeout_system.data.repositories.CashPaymentRepository;
import com.takeout.takeout_system.data.repositories.OrderLineItemRepository;
import com.takeout.takeout_system.data.repositories.PaymentRepository;
import com.takeout.takeout_system.exceptions.BusinessLogicException;
import com.takeout.takeout_system.exceptions.ItemNotFoundException;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import com.takeout.takeout_system.exceptions.StoreException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Slf4j
public class ProcessOrderServiceImpl implements ProcessOrderService {
    @Autowired
    private SaleService saleService;
    @Autowired
    private ManageStoreCrudService manageStoreCrudService;
    @Autowired
    private ManageItemCrudService manageItemCrudService;
    @Autowired
    private CashPaymentRepository cashPaymentRepository;

    @Override
    public Boolean makeNewOrder() {
        Store currentStore = manageStoreCrudService.getCurrentStore();
        if (currentStore==null) throw new StoreException("you need to enter a store to make a new order");
        log.info("current store-->{}", currentStore);
        Sale currentSale = saleService.getCurrentSale();
        log.info("current sale-->{}", currentSale);
        if (currentSale == null) {
            Sale sale = new Sale();
            sale.setStore(currentStore);
            currentStore.getSales().add(sale);
            sale.setComplete(false);
            sale.setReadyToPay(false);
            sale.setCurrentSale(true);
            return saleService.addSale(sale);
        }
        if(currentSale.isComplete()){
            currentSale.setStore(currentStore);
            currentStore.getSales().add(currentSale);
            currentSale.setComplete(false);
            currentSale.setReadyToPay(false);
            return saleService.addSale(currentSale);
        }
        return false;
    }

    @Override
    public boolean enterItem(EnterItemRequest enterItemRequest) {
        Item item = manageItemCrudService.findItem(enterItemRequest.getId());
        Sale currentSale = saleService.getCurrentSale();
        if (currentSale==null) throw new SaleNotFoundException("cannot perform operation," +
                " current sale does not exist");
        if (item.getStockNumber()<1) throw new ItemNotFoundException("item out of stock");
        if (!currentSale.isComplete()){
            OrderLineItem orderLineItem = new OrderLineItem();
            orderLineItem.setCurrentOrderLineItem(true);
            orderLineItem.setSale(currentSale);
            currentSale.getOrderLineItems().add(orderLineItem);
            orderLineItem.setQuantity(enterItemRequest.getQuantity());
            orderLineItem.setItem(item);
            orderLineItem.setSubAmount(calculateSubAmountOfCurrentOrderLineItem(orderLineItem));
            if (!isValidOrderQuantity(item.getStockNumber(), enterItemRequest.getQuantity()))
                throw new BusinessLogicException("order quantity greater than number in stock");
            item.setStockNumber(item.getStockNumber()-enterItemRequest.getQuantity());
            orderLineItem.setSubAmount(getSubAmount(item, enterItemRequest.getQuantity()));
            currentSale.getOrderLineItems().add(orderLineItem);
            saleService.addSale(currentSale);
            return true;
        }
        return false;
    }

    @Override
    public BigDecimal endOrder() {
        Sale currentSale = saleService.getCurrentSale();
        if (currentSale!=null && !currentSale.isComplete()&&!currentSale.isReadyToPay()){
            currentSale.setReadyToPay(true);
            currentSale.setAmount(calculateSaleAmount(currentSale));
            saleService.addSale(currentSale);
            return calculateSaleAmount(currentSale);
        }
        throw new SaleNotFoundException("there is no current sale");
    }

    @Override
    public Boolean makeCashPayment(BigDecimal amount) {
        Sale currentSale = saleService.getCurrentSale();
        log.info("sallee->{}", currentSale);
        Store currentStore = manageStoreCrudService.getCurrentStore();
        log.info("current sale->{}", currentSale.isReadyToPay());
        if (currentSale!=null&&!currentSale.isComplete()&& currentSale.isReadyToPay()){
            log.info("here");
            log.info("current sale->{}", currentSale.getAmount());

            if (amount.compareTo(currentSale.getAmount())>=0){
                log.info("here");
                CashPayment cashPayment = new CashPayment();
                cashPayment.setAmountTendered(amount);
                cashPayment.setSale(currentSale);
                currentSale.setPayment(cashPayment);
                currentSale.setStore(currentStore);
                currentStore.getSales().add(currentSale);
                cashPayment.setBalance(amount.subtract(currentSale.getAmount()));
                cashPaymentRepository.save(cashPayment);
                currentSale.setAccept(false);
                currentSale.setName(currentStore.getName());
                saleService.addSale(currentSale);
                return true;
            }
        }
        return false;
    }

    private BigDecimal getSubAmount(Item item, Integer quantity){
        return item.getPrice().multiply(BigDecimal.valueOf(quantity));
    }

    private BigDecimal calculateSaleAmount(Sale sale){
        AtomicReference<BigDecimal> sum = new AtomicReference<>(BigDecimal.ZERO);
        sale.getOrderLineItems().forEach(orderLineItem->{
            sum.set(BigDecimal.valueOf(sum.get().doubleValue() + orderLineItem.getSubAmount().doubleValue()));
        });
        return sum.get();

    }

    private BigDecimal calculateSubAmountOfCurrentOrderLineItem(OrderLineItem orderLineItem){
        return orderLineItem.getItem().getPrice();
    }

    private boolean isValidOrderQuantity(int stockNumber, int quantity){
        return stockNumber>quantity;
    }
}
