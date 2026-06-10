package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.CreateStoreRequest;
import com.takeout.takeout_system.data.dto.EnterItemRequest;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.OrderLineItem;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.models.Store;
import com.takeout.takeout_system.data.repositories.OrderLineItemRepository;
import com.takeout.takeout_system.exceptions.StoreException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ProcessOrderServiceImplTest {
    @Autowired
    private OrderLineItemRepository orderLineItemRepository;
    @Autowired
    private ManageStoreCrudService manageStoreCrudService;
    @Autowired
    private ProcessOrderService processOrderService;
    @Autowired
    private ManageItemCrudService manageItemCrudService;
    @Autowired
    private SaleService saleService;
    private CreateStoreRequest storeRequest;
    CreateItemRequest itemRequest;
    Sale sale;
    OrderLineItem orderLineItem;
    @BeforeEach
    void setUp(){

        storeRequest = new CreateStoreRequest();
        storeRequest.setName("test store");
        storeRequest.setAddress("test address");

        itemRequest = new CreateItemRequest();
        itemRequest.setName("test item");
        itemRequest.setPrice(BigDecimal.TEN);
        itemRequest.setStockNumber(10);

        sale = new Sale();
        sale.setName("test sale");
        sale.setCurrentSale(true);
        sale.setComplete(true);


        orderLineItem = new OrderLineItem();

        manageStoreCrudService.createStore(storeRequest);
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        store.setCurrentStore(true);
        manageStoreCrudService.save(store);
        saleService.addSale(sale);
        manageItemCrudService.createItem(itemRequest);


    }

    @AfterEach
    void tearDown(){
//        orderLineItemRepository.deleteAll();
//        manageItemCrudService.deleteItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
//        manageStoreCrudService.deleteStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
//        saleService.deleteSale(saleService.getAllSales().get(saleService.getAllSales().size()-1).getId());
    }

    @Test
    void makeNewOrderTest() {
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        store.setCurrentStore(true);
        manageStoreCrudService.save(store);
        boolean makeOrderResponse = processOrderService.makeNewOrder();
        assertThat(makeOrderResponse).isTrue();
    }

    @Test
    void exceptionIsThrownWhenAnOrderIsMadeWithoutCurrentStore(){
        Store store = manageStoreCrudService.getCurrentStore();
        store.setCurrentStore(false);
        manageStoreCrudService.save(store);
        assertThrows(StoreException.class, ()->processOrderService.makeNewOrder());
    }

    @Test
    void enterItem() {
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        log.info("all items->{}", manageItemCrudService.getAllItems().size());
        Item item = manageItemCrudService.findItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        item.setStore(store);
        manageItemCrudService.saveItem(item);
        EnterItemRequest enterItemRequest = new EnterItemRequest();
        enterItemRequest.setId(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        enterItemRequest.setQuantity(2);
        Sale sale = saleService.getSaleBy(saleService.getAllSales().get(saleService.getAllSales().size()-1).getId());
        sale.setComplete(false);
        saleService.addSale(sale);
        boolean enterItemResponse = processOrderService.enterItem(enterItemRequest);
        assertThat(enterItemResponse).isTrue();
    }


    @Test
    void endOrderTest() {
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        log.info("all items->{}", manageItemCrudService.getAllItems().size());
        Item item = manageItemCrudService.findItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        item.setStore(store);
        manageItemCrudService.saveItem(item);
        EnterItemRequest enterItemRequest = new EnterItemRequest();
        enterItemRequest.setId(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        enterItemRequest.setQuantity(1);
        processOrderService.enterItem(enterItemRequest);
        BigDecimal currentSaleAmount = processOrderService.endOrder();
        assertThat(currentSaleAmount).isEqualTo(BigDecimal.valueOf(10.00));

    }

    @Test
    void  makeCashPayment() {
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        store.setCurrentStore(true);
        manageStoreCrudService.save(store);
        Item item = manageItemCrudService.findItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        item.setStore(store);
        manageItemCrudService.saveItem(item);
        EnterItemRequest enterItemRequest = new EnterItemRequest();
        enterItemRequest.setId(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        enterItemRequest.setQuantity(1);
        processOrderService.enterItem(enterItemRequest);
        processOrderService.endOrder();
        boolean makeCashPaymentResponse = processOrderService.makeCashPayment(BigDecimal.TEN);
        assertThat(makeCashPaymentResponse).isTrue();
    }
}