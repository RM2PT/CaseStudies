package com.example.takeoutsystemservice.api.service;

import com.example.takeoutsystemservice.cardPayment.CardPaymentRepository;
import com.example.takeoutsystemservice.cashpayment.CashPayment;
import com.example.takeoutsystemservice.cashpayment.CashPaymentRepository;
import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.item.ItemRepository;
import com.example.takeoutsystemservice.orderlineitem.OrderLineItem;
import com.example.takeoutsystemservice.orderlineitem.OrderLineItemRepository;
import com.example.takeoutsystemservice.sale.Sale;
import com.example.takeoutsystemservice.sale.SaleRepository;
import com.example.takeoutsystemservice.store.Store;
import com.example.takeoutsystemservice.store.StoreRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class ProcessOrderService {
    private static final Logger LOGGER = LogManager.getLogger(ProcessOrderService.class);
    public static Sale currentSale;
    public static OrderLineItem currentOrderLine;
    public static List<String> currentPaymentMethod = new ArrayList<>();

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    SaleRepository saleRepository;
    @Autowired
    StoreRepository storeRepository;
    @Autowired
    OrderLineItemRepository orderLineItemRepository;
    @Autowired
    CashPaymentRepository cashPaymentRepository;

    ProcessOrderService() {
        currentPaymentMethod.add("CASH");
        currentPaymentMethod.add("CARD");
    }

    public boolean makeNewOrder() {
        try {
            if(TakeOutSystem.currentStore != null) {
                if(currentSale == null || (currentSale!= null && currentSale.isComplete())) {
                    Store currentStore = TakeOutSystem.currentStore;
                    Item existingItem = currentStore.getItem();

                    Sale sale = new Sale();
                    sale.setUuid(UUID.randomUUID().toString());
                    sale.setStoreSale(TakeOutSystem.currentStore);
                    sale.setComplete(false);
                    sale.setReadyToPay(false);
                    sale.setAccept(false);
                    sale.setName("testSale");
                    Set<Sale> sales = new HashSet<>();
                    currentStore.setStoreToSale(sales);
                    currentStore.setSale(sale);

                    currentStore.setItem(null); //fix duplicate issue
                    Store s = storeRepository.save(currentStore);
                    currentStore.setItem(existingItem);
                    currentSale = s.getSale();

                    LOGGER.info("Sale order has saved id: "+sale.getUuid());
                    return true;
                }
            }

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }

        return false;
    }

    @Transactional
    @Modifying
    public boolean enterItem(String id, Integer quantity) {
        try {
            Item item = itemRepository.getItemByUid(id);
            if(item != null && item.getStockNumber() > 0  && currentSale != null && !currentSale.isComplete()) {
                OrderLineItem sli = new OrderLineItem();
                currentOrderLine = sli;
                sli.setOrderLineItemToSale(currentSale);
                Set<OrderLineItem> orders = new HashSet<>();
                orders.add(sli);
                currentSale.setSaleToOrderLineItem(orders);
                item.setStockNumber(item.getStockNumber()-quantity);
                sli.setQuantity(quantity);
                sli.setSubAmount(item.getPrice() * quantity);
                saleRepository.save(currentSale);
                LOGGER.info("Item has entered");
                return true;

            }

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return false;
    }

    public double endOrder() {
        try {
            if(currentSale != null && !currentSale.isComplete() && !currentSale.isReadyToPay()) {
                Set<OrderLineItem> lineItems = currentSale.getSaleToOrderLineItem();
                Double totalSum = lineItems.stream().map(OrderLineItem::getSubAmount).reduce(0.0, Double::sum);
                currentSale.setAmount(totalSum);
                currentSale.setReadyToPay(true);
                LOGGER.info("Item has entered and Amount "+currentSale.getAmount());
                return currentSale.getAmount();
            }

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return 0.0;
    }

    public boolean makeCashPayment(double amount) {
        try {
            if(currentSale != null && !currentSale.isComplete() && !currentSale.isReadyToPay()
                    && currentSale.getAmount()>= amount) {
                CashPayment cp = new CashPayment();
                cp.setAmountTendered(amount);
                currentSale.setSaleToPayment(cp);
                currentSale.setAccept(false);
                currentSale.setName(TakeOutSystem.currentStore.getName());
                cashPaymentRepository.save(cp);
                return true;

                }
            } catch (Exception e) {
            LOGGER.error(e);
        }
        return false;
    }


}
