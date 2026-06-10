package com.takeout.takeout_system.services;


import com.takeout.takeout_system.data.dto.CreateItemRequest;
import com.takeout.takeout_system.data.dto.ModifyItemRequest;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.ProductCatalogue;
import com.takeout.takeout_system.data.repositories.ItemRepository;
import com.takeout.takeout_system.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ManageItemCrudServiceImpl implements ManageItemCrudService{
    @Autowired
    private ItemRepository itemRepository;
    private final ModelMapper modelMapper = new ModelMapper();


    @Override
    public Boolean createItem(CreateItemRequest createItemRequest) {
        Item item = new Item();
        item.setName(createItemRequest.getName());
        item.setPrice(createItemRequest.getPrice());
        item.setOrderPrice(createItemRequest.getOrderPrice());
        item.setStockNumber(createItemRequest.getStockNumber());
        item.setProductCatalogue(new ProductCatalogue());
        item.setStore(createItemRequest.getStore());
        Item savedItem = itemRepository.save(item);
        return savedItem.getId() > 0;
    }

    @Override
    public Item findItem(Long id) {
        return itemRepository.findById(id).orElseThrow(()->new ItemNotFoundException(String.format("item with id %d not found", id)));
    }

    @Override
    public Item findBy(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public Boolean modifyItem(Long id, ModifyItemRequest modifyItemRequest){
        Item foundItem = itemRepository.findById(id).orElseThrow(()->new ItemNotFoundException(String.format("item with id %d not found", id)));
        modelMapper.map(modifyItemRequest, foundItem);
        Item savedUpdatedItem = itemRepository.save(foundItem);
        return savedUpdatedItem.getId()>0;
    }

    @Override
    public Boolean deleteItem(Long id) {
        Item foundItem  = itemRepository.findById(id).orElseThrow(()->new ItemNotFoundException(String.format("item with id %d not found", id)));
        itemRepository.deleteById(foundItem.getId());
        return true;
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

}
