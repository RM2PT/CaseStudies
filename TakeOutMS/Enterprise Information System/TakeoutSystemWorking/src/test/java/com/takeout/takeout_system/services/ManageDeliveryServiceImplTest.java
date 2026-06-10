package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateDeliveryRequest;
import com.takeout.takeout_system.data.models.Delivery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManageDeliveryServiceImplTest {

    @Autowired
    private ManageDeliveryService manageDeliveryService;
    private CreateDeliveryRequest createDeliveryRequest;

    @BeforeEach
    void setup(){
        createDeliveryRequest=new CreateDeliveryRequest();
        createDeliveryRequest.setName("test_delivery");
    }

    @Test
    void createDeliveryTest(){
        Boolean response = manageDeliveryService.createDelivery(createDeliveryRequest);
        assertThat(response).isTrue();
    }
}