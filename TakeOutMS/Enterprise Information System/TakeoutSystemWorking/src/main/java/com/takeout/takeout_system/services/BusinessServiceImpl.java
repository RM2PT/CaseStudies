package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.FindItemResponse;
import com.takeout.takeout_system.data.dto.FindSaleResponse;
import com.takeout.takeout_system.data.dto.ModifyItemRequest;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class BusinessServiceImpl implements BusinessService{
    @Autowired
    private SaleService saleService;
    @Autowired
    private ManageItemCrudService manageItemCrudService;
    @Autowired
    private TakeOutSystemService takeOutSystemService;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Boolean enterStore(Long id) {
        return takeOutSystemService.enterStore(id);
    }

    @Override
    public FindSaleResponse getSaleBy(Long id) {
        Sale sale =saleService.getSaleBy(id);
        return modelMapper.map(sale, FindSaleResponse.class);
    }

    @Override
    public FindSaleResponse getSaleBy(String name) {
        return modelMapper.map(saleService.getSaleBy(name), FindSaleResponse.class);
    }

    @Override
    public Boolean createItem(CreateItemRequest createItemRequest) {
        return manageItemCrudService.createItem(createItemRequest);
    }

    @Override
    public FindItemResponse findItem(Long id) {
        return modelMapper.map(manageItemCrudService.findItem(id), FindItemResponse.class);
    }

    @Override
    public FindItemResponse findBy(String name) {
        Item item = manageItemCrudService.findBy(name);
        return modelMapper.map(item, FindItemResponse.class);
    }

    @Override
    public Boolean modifyItem(Long id, ModifyItemRequest modifyItemRequest) {
        return manageItemCrudService.modifyItem(id, modifyItemRequest);
    }

    @Override
    public Boolean deleteItem(Long id) {
        return manageItemCrudService.deleteItem(id);
    }


    @Override
    public List<FindItemResponse> getAllItems() {
        List<FindItemResponse> allItemResponse = new ArrayList<>();
        List<Item> allItems = manageItemCrudService.getAllItems();
        allItems.forEach(item -> {
            allItemResponse.add(modelMapper.map(item, FindItemResponse.class));
        });
        return allItemResponse;
    }

    @Override
    public Set<Sale> excursionPublicOrder(Long id) {
        return takeOutSystemService.excursionPublicOrder(id);
    }
}
