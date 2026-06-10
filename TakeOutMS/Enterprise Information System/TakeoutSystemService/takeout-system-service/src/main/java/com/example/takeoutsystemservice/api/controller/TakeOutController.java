package com.example.takeoutsystemservice.api.controller;

import com.example.takeoutsystemservice.api.service.*;
import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.sale.Sale;
import com.example.takeoutsystemservice.store.Store;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(value = {"/takeout"})
@CrossOrigin("*")public class TakeOutController {
    private static final Logger LOGGER = LogManager.getLogger(TakeOutController.class);

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

    /*To Test Docker*/
    //TODO: remove after testing

    @GetMapping(value = "/test")
    public String getTestData() {
        return "System has started";
    }


    @PostMapping(value = "/delivery")
    public boolean createDelivery(@RequestParam("id") String id, @RequestParam("name") String name) {
        return manageDeliveryCRUDService.createDelivery(id, name);
    }

    /**
     * Store Apis
     * */
    @PostMapping(value = "/store")
    public boolean createNewStore(@RequestParam("id") String id, @RequestParam("name") String name,
                                  @RequestParam("address") String address, @RequestParam("isOpened") boolean isOpened) {
        return manageStoreCRUDService.createStore(id, name, address, isOpened);
    }

    @PutMapping(value = "/enterStore")
    public boolean enterStore(@RequestParam("id") String id) {

        return takeOutSystem.enterStore(id);
    }

    @GetMapping(value = "/queryStore")
    public Store queryStore(@RequestParam("id") String id) {

        return manageStoreCRUDService.queryStore(id);
    }

    @PutMapping(value = "/store")
    public boolean modifyStore(@RequestParam("id") String id, @RequestParam("name") String name,
                               @RequestParam("address") String address, @RequestParam("isOpened") boolean isOpened) {
        return manageStoreCRUDService.modifyStore(id, name, address, isOpened);
    }

    @DeleteMapping(value = "/store")
    public boolean deleteStore(@RequestParam("id") String id) {
        return manageStoreCRUDService.deleteStore(id);
    }

    /**
     * Items APIs
     * */
    @PostMapping(value = "/item")
    public boolean createItem(@RequestParam("id") String id, @RequestParam("name") String name,
                              @RequestParam("price") double price, @RequestParam("stockNumber") Integer stockNumber,
                              @RequestParam("orderPrice") double orderPrice) {
        return manageItemCRUDService.createItem(id, name, price, stockNumber, orderPrice);
    }

    @GetMapping(value = "/item/queryItem")
    public Item queryItem(@RequestParam("id") String id) {
        return manageItemCRUDService.queryItem(id);
    }

    @PutMapping(value = "/item")
    public boolean modifyItem(@RequestParam("id") String id, @RequestParam("name") String name,
                              @RequestParam("price") double price, @RequestParam("stockNumber") Integer stockNumber,
                              @RequestParam("orderPrice") double orderPrice) {
        return manageItemCRUDService.modifyItem(id, name, price, stockNumber, orderPrice);
    }

    @DeleteMapping(value = "/item")
    public boolean deleteItem(@RequestParam("id") String id) {
        return manageItemCRUDService.deleteItem(id);
    }

    @GetMapping(value = "/item/search")
    public Item searchItem(@RequestParam("name") String name) {
        return takeOutSystem.search(name);
    }

    @PostMapping(value = "/enterItem")
    public boolean enterItem(@RequestParam("id") String id, @RequestParam("quantity") Integer quantity) {
        return processOrderService.enterItem(id, quantity);
    }


    /**
     * Order (Sale) Apis
     * */
    @PostMapping(value = "/order")
    public boolean createNewOrder() {
        return processOrderService.makeNewOrder();
    }

    @PostMapping(value = "/acceptOrder")
    public boolean createSaleOrder(@RequestParam("name") String name) {
        return manageDeliveryCRUDService.acceptOrder(name);
    }

    @PutMapping(value = "/terminateOrder")
    public boolean terminateOrder(@RequestParam("name") String name) {
        return takeOutSystem.terminateOrder(name);
    }

    @GetMapping(value = "/excursionPublicOrder")
    public Set<Sale> excursionPublicOrder(@RequestParam("id") String id) {
        return takeOutSystem.excursionPublicOrder(id);
    }

    @GetMapping(value = "/endOrder")
    public double endOrder() {
        return processOrderService.endOrder();
    }

    @PostMapping(value = "/order/cashPayment")
    public boolean makePayment(@RequestParam("amount") double amount) {
        return processOrderService.makeCashPayment(amount);
    }

}
