package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Store;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class StoreRepositoryTest {
    @Autowired
    private StoreRepository storeRepository;

    @BeforeEach
    void setUp() {
        Store store = new Store();
        store.setName("test store");
        store.setAddress("test address");
        store.setCurrentStore(true);
        storeRepository.save(store);
    }

    @Test
    void testFindByCurrentSaleIsTrue() {
        Store currentStore = storeRepository.findByIsCurrentStoreIsTrue();
        assertThat(currentStore).isNotNull();
        log.info("store->{}", currentStore);
        assertThat(currentStore.getName()).isEqualTo("test store");
    }
}