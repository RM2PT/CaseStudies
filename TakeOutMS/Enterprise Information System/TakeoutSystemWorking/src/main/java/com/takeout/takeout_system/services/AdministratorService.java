package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.*;
import com.takeout.takeout_system.data.models.Customer;
import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Store;

import java.util.List;

public interface AdministratorService {
    FindCustomerResponse getCustomerById(Long id);
    boolean createStore(CreateStoreRequest createStoreRequest);
    FindStoreResponse findStore(Long id);
    boolean modifyStore(ModifyStoreRequest modifyStoreRequest);
    boolean deleteStore(Long id);
    FindStoreResponse getCurrentStore();
    List<FindStoreResponse> getAllStores();
    Boolean createDelivery(CreateDeliveryRequest createDeliveryRequest);
}
