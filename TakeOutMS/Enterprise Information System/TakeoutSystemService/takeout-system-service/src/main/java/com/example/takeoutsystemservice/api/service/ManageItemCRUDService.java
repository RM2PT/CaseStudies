package com.example.takeoutsystemservice.api.service;

import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.item.ItemRepository;
import com.example.takeoutsystemservice.store.StoreRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class ManageItemCRUDService {
    private static final Logger LOGGER = LogManager.getLogger(ManageItemCRUDService.class);

    @Autowired
    ItemRepository itemRepository;
    @Autowired
    StoreRepository storeRepository;

    public boolean createItem(String id, String name, double price, Integer stockNumber, double orderPrice) {
        try {
            Item obj = itemRepository.getItemByUid(id);
            if(obj == null) {
                Item item = new Item();
                item.setUuid(id);
                item.setName(name);
                item.setPrice(price);
                item.setOrderPrice(orderPrice);
                item.setStockNumber(stockNumber);
                item.setItemToStore(TakeOutSystem.currentStore);

                TakeOutSystem.currentStore.setItem(item);
                storeRepository.save(TakeOutSystem.currentStore);
                LOGGER.info("Item has saved: "+item.getUuid());
                return true;
            }
            else {
                LOGGER.info("Item already exist");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public Item queryItem(String id) {
        Item obj = new Item();
        try {
            obj = itemRepository.getItemByUid(id);
            if(obj != null) {
                return obj;

            }
            else {
                LOGGER.info("Item already exist");
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return obj;
    }


    @Modifying
    @Transactional
    public boolean modifyItem(String id, String name, double price, Integer stockNumber, double orderPrice) {
        try {
            Item obj = itemRepository.getItemByUid(id);
            if(obj != null) {
                obj.setName(name);
                obj.setUuid(UUID.randomUUID().toString());
                obj.setPrice(price);
                obj.setOrderPrice(orderPrice);
                obj.setStockNumber(stockNumber);
                obj.setItemToStore(TakeOutSystem.currentStore);
                itemRepository.save(obj);
                return true;
            }
            else {
                LOGGER.info("Item does not exist");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    @Modifying
    @Transactional
    public boolean deleteItem(String id) {
        try {
            Item obj = itemRepository.getItemByUid(id);
            if(obj != null) {
                itemRepository.delete(obj);
                LOGGER.info("Item has deleted successfully: id: "+id);
                return true;
            }
            else {
                LOGGER.info("Item does not exist");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

}
