package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateStoreRequest;
import com.takeout.takeout_system.data.dto.FindStoreResponse;
import com.takeout.takeout_system.data.dto.ModifyStoreRequest;
import com.takeout.takeout_system.data.models.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManageStoreCrudService {
    boolean createStore(CreateStoreRequest createStoreRequest);
    Store findStore(Long id);
    boolean modifyStore(ModifyStoreRequest modifyStoreRequest);
    boolean deleteStore(Long id);
    Store save(Store store);
    Store getCurrentStore();
    List<FindStoreResponse> getAllStores();
}
