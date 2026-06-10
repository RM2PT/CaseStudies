package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.FindItemResponse;
import com.takeout.takeout_system.data.dto.FindSaleResponse;
import com.takeout.takeout_system.data.dto.ModifyItemRequest;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;

import java.util.List;
import java.util.Set;

public interface BusinessService {
    Boolean enterStore(Long id);
    FindSaleResponse getSaleBy(Long id);
    FindSaleResponse getSaleBy(String name);
    Boolean createItem(CreateItemRequest createItemRequest);
    FindItemResponse findItem(Long id);
    FindItemResponse findBy(String name);
    Boolean modifyItem(Long id, ModifyItemRequest modifyItemRequest) ;
    Boolean deleteItem(Long id);
    List<FindItemResponse> getAllItems();
    Set<Sale> excursionPublicOrder(Long id);
}
