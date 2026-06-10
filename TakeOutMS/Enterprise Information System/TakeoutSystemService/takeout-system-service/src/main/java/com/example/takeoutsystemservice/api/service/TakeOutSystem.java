package com.example.takeoutsystemservice.api.service;

import com.example.takeoutsystemservice.api.controller.TakeOutController;
import com.example.takeoutsystemservice.delivery.Delivery;
import com.example.takeoutsystemservice.delivery.DeliveryRepository;
import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.item.ItemRepository;
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
import java.util.HashSet;
import java.util.Set;

@Service
public class TakeOutSystem {
    private static final Logger LOGGER = LogManager.getLogger(TakeOutSystem.class);

    public static Store currentStore;
    public static Delivery currentDelivery;
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private StoreRepository storeRepository;

    public boolean terminateOrder(String name) {
        try {
            Sale sale = saleRepository.getSaleByName(name);
            if(sale != null){
              if(sale.isAccept() && sale.getSaleToDelivery().getUuid().equalsIgnoreCase(currentDelivery.getUuid())){
                  sale.setComplete(true);
                  saleRepository.save(sale);
                  LOGGER.info("Sale order has terminated");
                  return true;
              }
              else {
                  LOGGER.info("Second condition is false");
              }
            }
            else {
                LOGGER.info("Order does not exist name: "+name);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public Set<Sale> excursionPublicOrder(String id) {
        Set<Sale> sales = new HashSet<>();
        try {
            Delivery obj = deliveryRepository.getDeliveryByUuid(id);
            if(obj != null) {
                sales = obj.getDeliveryToSale();
            }
            else {
                LOGGER.info("No existing Delivery Object found: id: "+id);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return sales;
    }

    public boolean enterStore(String id) {
        try {
            Store store = storeRepository.getStoreById(id);
            if(store != null ) {
                TakeOutSystem.currentStore = store;
                LOGGER.info("Entered in Store, select to current store");
                return true;
            }
            else {
                LOGGER.info("Store does not exist name: "+id);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public Item search(String itemName) {
        try {
            Item obj = itemRepository.searchItemByName(itemName);
            if(obj != null) {
                return obj;
            }
            else {
                LOGGER.info("Item does not exist");
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

}
