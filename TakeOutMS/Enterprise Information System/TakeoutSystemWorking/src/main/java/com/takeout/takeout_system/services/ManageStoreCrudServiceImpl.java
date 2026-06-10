package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateStoreRequest;
import com.takeout.takeout_system.data.dto.FindStoreResponse;
import com.takeout.takeout_system.data.dto.ModifyStoreRequest;
import com.takeout.takeout_system.data.models.Store;
import com.takeout.takeout_system.data.repositories.StoreRepository;
import com.takeout.takeout_system.exceptions.StoreException;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
@Slf4j
public class ManageStoreCrudServiceImpl implements ManageStoreCrudService {

    @Autowired
    private StoreRepository storeRepository;

    private final ModelMapper mapper = new ModelMapper();


    @Override
    public boolean createStore(CreateStoreRequest createStoreRequest) {
        Store store = mapper.map(createStoreRequest, Store.class);
        store.setProductCatalogues(new HashSet<>());
        store.setItems(new HashSet<>());
        store.setSales(new HashSet<>());
        store.setOpened(true);
        Store savedStore = storeRepository.save(store);
        if (savedStore!=null) return true;
        return false;
    }

    @Override
    public Store findStore(Long id) {
        return storeRepository.findById(id).orElseThrow(()->new StoreException(String.format("store with id %d not found", id)));

    }

    @Override
    public boolean modifyStore(ModifyStoreRequest modifyStoreRequest) {
        Store foundStore = storeRepository.findById(modifyStoreRequest.getId())
                .orElseThrow(()->new StoreException(String.format("store with id %d not found", modifyStoreRequest.getId())));
        mapper.map(modifyStoreRequest, foundStore);
        Store savedStore =storeRepository.save(foundStore);
        return true;
    }

    @Override
    public boolean deleteStore(Long id) {
        Store foundStore = storeRepository.findById(id)
                .orElseThrow(()->new StoreException(String.format("store with id %d not found", id)));
        storeRepository.deleteById(foundStore.getId());
        return true;
    }

    @Override
    public Store save(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public Store getCurrentStore() {
        return storeRepository.findByIsCurrentStoreIsTrue();
    }

    @Override
    public List<FindStoreResponse> getAllStores() {
        List<Store> allStores =  storeRepository.findAll();
        List<FindStoreResponse> allStoresResponse = new ArrayList<>();
        allStores.forEach(store -> {
            allStoresResponse.add(mapper.map(store, FindStoreResponse.class));
        });
        return allStoresResponse;
    }
}
