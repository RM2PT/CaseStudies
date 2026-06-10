package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateStoreRequest;
import com.takeout.takeout_system.data.dto.ModifyStoreRequest;
import com.takeout.takeout_system.data.models.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManageStoreCrudServiceImplTest {
    @Autowired
    private ManageStoreCrudService manageStoreCrudService;
    private CreateStoreRequest storeRequest;
    private ModifyStoreRequest modifyStoreRequest;

    @BeforeEach
    void setUp(){
        storeRequest = new CreateStoreRequest();
        storeRequest.setName("test-store");
        storeRequest.setAddress("test-address");

        modifyStoreRequest=new ModifyStoreRequest();
        modifyStoreRequest.setName("taste-store");

    }

    @Test
    void createStoreTest(){
        boolean createStoreResponse = manageStoreCrudService.createStore(storeRequest);
        assertThat(createStoreResponse).isTrue();
    }

    @Test
    void modifyStoreTest(){
       boolean createStoreResponse =  manageStoreCrudService.createStore(storeRequest);
       assertThat(createStoreResponse).isTrue();
        Store store = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        modifyStoreRequest.setId(store.getId());
        boolean modifyResponse = manageStoreCrudService.modifyStore(modifyStoreRequest);
       assertThat(modifyResponse).isTrue();

    }

    @Test
    void findStoreTest(){
        boolean createStoreResponse = manageStoreCrudService.createStore(storeRequest);
        Store foundStore = manageStoreCrudService.findStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        assertThat(foundStore).isNotNull();
    }

    @Test
    void deleteStoreTest(){
        boolean createStoreResponse = manageStoreCrudService.createStore(storeRequest);
        assertThat(createStoreResponse).isTrue();
        boolean response = manageStoreCrudService.deleteStore(manageStoreCrudService.getAllStores().get(manageStoreCrudService.getAllStores().size()-1).getId());
        assertThat(response).isTrue();

    }
}