package com.takeout.takeout_system.services;


import com.takeout.takeout_system.data.dto.CreateDeliveryRequest;
import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.CreateStoreRequest;
import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.models.Store;
import com.takeout.takeout_system.data.repositories.DeliveryRepository;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TakeOutSystemServiceImplTest {

    @Autowired
    private TakeOutSystemServiceImpl takeOutSystemService;
    @Autowired
    private SaleService saleService;
    @Autowired
    private ManageDeliveryService manageDeliveryService;
    @Autowired
    private ManageItemCrudService manageItemCrudService;
    @Autowired
    private ManageStoreCrudService manageStoreCrudService;

    private Sale sale;

    private CreateDeliveryRequest deliveryRequest;

    private CreateStoreRequest createStoreRequest;

    private CreateItemRequest createItemRequest;

    @BeforeEach
    void setUp(){
        createItemRequest = new CreateItemRequest();
        createItemRequest.setName("test item");
        createItemRequest.setPrice(BigDecimal.TEN);
        createItemRequest.setStockNumber(3);


        sale = new Sale();
        sale.setName("test sale");
        Store store = new Store();
        store.setName("test store");
        store.setAddress("test Address");
        sale.setStore(store);

        saleService.addSale(sale);

        deliveryRequest=new CreateDeliveryRequest();
        deliveryRequest.setName("test deliveryy");

        createStoreRequest=new CreateStoreRequest();
        createStoreRequest.setAddress("test address");
        createStoreRequest.setName("test store");

    }

    @Test
    void acceptOrderTest() throws SaleNotFoundException {
        Boolean acceptOrderResponse = takeOutSystemService.acceptOrder("test sale");
        assertThat(acceptOrderResponse).isTrue();
    }

    @Test
    void  terminateOrderTest() throws SaleNotFoundException {
        saleService.addSale(sale);
        Boolean terminateOrderResponse = takeOutSystemService.terminateOrder("test sale");
        assertThat(terminateOrderResponse).isTrue();
    }

    @Test
    void excursionPublicOrderTest() {
        manageDeliveryService.createDelivery(deliveryRequest);
        Delivery delivery = manageDeliveryService.findByName(deliveryRequest.getName());
        log.info("delivery-id->{}", delivery.getId());
        Set<Sale> deliverySet = takeOutSystemService.excursionPublicOrder(delivery.getId());
        assertThat(deliverySet).isNotNull();
        assertThat(deliverySet).containsExactly(delivery.getSale().toArray(new Sale[0]));
    }

    @Test
    void enterStoreTest() {
        manageStoreCrudService.createStore(createStoreRequest);
        Boolean response = takeOutSystemService.enterStore(3L);
        assertThat(manageStoreCrudService.getCurrentStore()).isEqualTo(manageStoreCrudService.findStore(3L));
        assertThat(response).isTrue();

    }

    @Test
    void searchTest() {
        Store store = new Store();
        store.setName("testy store");
        store.setAddress("testy address");
        createItemRequest.setStore(store);
        Boolean createItemResponse = manageItemCrudService.createItem(createItemRequest);
        assertThat(createItemResponse).isTrue();
        Item foundItem = takeOutSystemService.search(createItemRequest.getName());
        assertThat(foundItem).isNotNull();
        assertThat(foundItem.getName()).isEqualTo(createItemRequest.getName());
    }
}