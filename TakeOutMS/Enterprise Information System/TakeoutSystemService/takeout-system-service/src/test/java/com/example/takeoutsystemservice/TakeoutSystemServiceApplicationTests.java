package com.example.takeoutsystemservice;

import com.example.takeoutsystemservice.api.service.*;
import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.store.Store;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TakeoutSystemServiceApplicationTests {

    @Autowired
    ManageDeliveryCRUDService manageDeliveryCRUDService;
    @Autowired
    ManageItemCRUDService manageItemCRUDService;
    @Autowired
    ManageStoreCRUDService manageStoreCRUDService;
    @Autowired
    ProcessOrderService processOrderService;
    @Autowired
    TakeOutSystem takeOutSystem;


    @BeforeAll
    public static void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }


    /*This function is setting local Running Model which needs for reference for other objects */
    @BeforeEach
    public void setModelAndRunningModel() {

    }

    /** These are tests are related to each other that's why they can be test in once case due to temporary variables and
     * their scope
     * */

    @Test
    public void testAllScenarios() {

        boolean storeCreation =  manageStoreCRUDService.createStore("555888", "Store QB", "427 ave dr", true);
        assertTrue(storeCreation);

        boolean enterStore =  takeOutSystem.enterStore("555888");
        assertTrue(enterStore);

        boolean createItem = manageItemCRUDService.createItem("11151","Test Item 4", 10.0, 20, 12);
        assertTrue(createItem);

        boolean saleOrder = processOrderService.makeNewOrder();
        assertTrue(saleOrder);

        boolean createDelivery = manageDeliveryCRUDService.createDelivery("123", "Final Delivery");
        assertTrue(createDelivery);

        boolean acceptOrder = manageDeliveryCRUDService.acceptOrder("testSale");
        assertTrue(acceptOrder);

        boolean enterItem = processOrderService.enterItem("11151", 5);
        assertTrue(enterItem);

        double endOrder = processOrderService.endOrder();
        Assertions.assertEquals(endOrder, 50);


        //Once Test completes either refresh Db or change Ids
    }

    @Test
    public void StoreAPITest() {
        boolean storeCreation =  manageStoreCRUDService.createStore("777666", "Store QB", "427 ave dr", true);
        assertTrue(storeCreation);

        boolean storeModify =  manageStoreCRUDService.createStore("121212", "Store AZ", "427 ave dr", true);
        assertTrue(storeModify);

        boolean modifyStore =  manageStoreCRUDService.modifyStore("121212", "Update Store AZ", "490 ave Palo Alto", true);
        assertTrue(modifyStore);

        Store store =  manageStoreCRUDService.queryStore("121212");
        assertNotNull(store);

        boolean deleteItem = manageStoreCRUDService.deleteStore("121212");
        assertTrue(deleteItem);

    }

    @Test
    public void ItemAPIs() {

        boolean storeCreation =  manageStoreCRUDService.createStore("777666", "Store QB", "427 ave dr", true);
        assertTrue(storeCreation);

        boolean enterStore =  takeOutSystem.enterStore("777666");
        assertTrue(enterStore);

        boolean createItem = manageItemCRUDService.createItem("222555","Test Item 15", 20, 50, 12);
        assertTrue(createItem);

        boolean modifyItem = manageItemCRUDService.modifyItem("222555","Test Item 22", 15, 50, 12);
        assertTrue(modifyItem);

        Item item = manageItemCRUDService.queryItem("222555");
        assertNotNull(item);

        boolean result = manageItemCRUDService.deleteItem("222555");
        assertTrue(result);

    }

    @Test
    public void cashPayment() {

        boolean storeCreation =  manageStoreCRUDService.createStore("555888", "Store QB", "427 ave dr", true);
        assertTrue(storeCreation);

        boolean enterStore =  takeOutSystem.enterStore("555888");
        assertTrue(enterStore);

        boolean createItem = manageItemCRUDService.createItem("11151","Test Item 4", 10.0, 20, 12);
        assertTrue(createItem);

        boolean saleOrder = processOrderService.makeNewOrder();
        assertTrue(saleOrder);

        boolean createDelivery = manageDeliveryCRUDService.createDelivery("123", "Final Delivery");
        assertTrue(createDelivery);

        boolean acceptOrder = manageDeliveryCRUDService.acceptOrder("testSale");
        assertTrue(acceptOrder);

        boolean enterItem = processOrderService.enterItem("11151", 5);
        assertTrue(enterItem);

        boolean paymentStatus = processOrderService.makeCashPayment(120);
        assertTrue(paymentStatus);

        //Once Test completes either refresh Db or change Ids
    }



}
