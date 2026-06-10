package com.example.takeoutsystemservice.api.service;

import com.example.takeoutsystemservice.store.Store;
import com.example.takeoutsystemservice.store.StoreRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class ManageStoreCRUDService {
    private static final Logger LOGGER = LogManager.getLogger(ManageStoreCRUDService.class);
    @Autowired
    StoreRepository storeRepository;

    public boolean createStore(String id, String name, String address, boolean isOpened) {
        try {
            Store obj = storeRepository.getStoreById(id);
            if(obj == null) {
                Store store = new Store();
                store.setUuid(id);  //setting external fot test cases so that can be use without manual interaction
                store.setName(name);
                store.setAddress(address);
                store.setOpened(isOpened);
                storeRepository.save(store);
                LOGGER.info("Store has created with id: "+store.getUuid());
                return true;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    @Transactional
    @Modifying
    public boolean modifyStore(String id, String name, String address, boolean isOpened) {
        try {
            Store store = storeRepository.getStoreById(id); //by uuid which is unique for every record
            store.setName(name);
            store.setAddress(address);
            store.setOpened(isOpened);
            storeRepository.save(store);
            LOGGER.info("Store data has updated");
            return true;

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    @Transactional
    @Modifying
    public boolean deleteStore(String id) {
        try {
            Store store = storeRepository.getStoreById(id); //by uuid which is unique for every record
            if(store != null) {
                storeRepository.delete(store);
                LOGGER.info("Store has deleted with Id: "+id);
                return true;
            } else {
                LOGGER.info("Object does not exist against id: "+id);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public Store queryStore(String id) {
        try {
            Store store = storeRepository.getStoreById(id);
            if(store != null) {
                return store;
            }
            else {
                LOGGER.info("No Store exist against: id"+id);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null; //should be sent optionalObject or custom wrap message
    }
}
