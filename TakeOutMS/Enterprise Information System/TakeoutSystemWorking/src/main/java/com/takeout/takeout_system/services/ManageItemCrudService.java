package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.FindItemResponse;
import com.takeout.takeout_system.data.dto.ModifyItemRequest;
import com.takeout.takeout_system.data.models.Item;

import java.io.IOException;
import java.util.List;

public interface ManageItemCrudService {
    Boolean createItem(CreateItemRequest createItemRequest);
    Item findItem(Long id);
    Item findBy(String name);
    Boolean modifyItem(Long id, ModifyItemRequest modifyItemRequest) ;
    Boolean deleteItem(Long id);
    Item saveItem(Item item);
    List<Item> getAllItems();
}
