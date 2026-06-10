package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.ModifyItemRequest;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.repositories.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManageItemCrudServiceImplTest {

    @Autowired
    private ManageItemCrudService manageItemCrudService;
    private CreateItemRequest createItemRequest;
    private ModifyItemRequest request;

    @BeforeEach
    void setUp(){
        createItemRequest = new CreateItemRequest();
        createItemRequest.setName("test_item");
        createItemRequest.setPrice(BigDecimal.TEN);
        createItemRequest.setOrderPrice(BigDecimal.ZERO);
        createItemRequest.setStockNumber(10);

        request = new ModifyItemRequest();
        request.setPrice(BigDecimal.valueOf(20));
        request.setStockNumber(2);
    }

    @Test
    void createItemTest() {
       Boolean createItemResponse = manageItemCrudService.createItem(createItemRequest);
       assertThat(createItemResponse).isTrue();
    }


    @Test
    void findItemTest() {
       Boolean createItemResponse =  manageItemCrudService.createItem(createItemRequest);
       assertThat(createItemResponse).isTrue();
       Item foundItem = manageItemCrudService.findItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
       assertThat(foundItem).isNotNull();
    }

    @Test
    void modifyItemTest()  {
        Boolean createItemResponse =  manageItemCrudService.createItem(createItemRequest);
        assertThat(createItemResponse).isTrue();
        Boolean updateResponse = manageItemCrudService.modifyItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId(), request);
        assertThat(updateResponse).isTrue();

    }

    @Test
    void deleteItemTest() {
        Boolean createItemResponse = manageItemCrudService.createItem(createItemRequest);
        assertThat(createItemResponse).isTrue();
        Boolean deleteResponse = manageItemCrudService.deleteItem(manageItemCrudService.getAllItems().get(manageItemCrudService.getAllItems().size()-1).getId());
        assertThat(deleteResponse).isTrue();
    }
}