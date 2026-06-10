package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.*;

import com.takeout.takeout_system.data.models.Store;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdministratorServiceImpl implements AdministratorService{

    private CustomerService customerService;
    private ManageStoreCrudService manageStoreCrudService;
    private ManageDeliveryService manageDeliveryService;

    private final ModelMapper mapper = new ModelMapper();

    @Override
    public FindCustomerResponse getCustomerById(Long id) {
        return customerService.getCustomerById(id);
    }

    @Autowired
    public void setManageStoreCrudService(ManageStoreCrudService manageStoreCrudService) {
        this.manageStoreCrudService = manageStoreCrudService;
    }

    @Autowired
    public void setManageDeliveryService(ManageDeliveryService manageDeliveryService) {
        this.manageDeliveryService = manageDeliveryService;
    }

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public boolean createStore(CreateStoreRequest createStoreRequest) {
        return manageStoreCrudService.createStore(createStoreRequest);

    }

    @Override
    public FindStoreResponse findStore(Long id) {
        Store store = manageStoreCrudService.findStore(id);
        return mapper.map(store, FindStoreResponse.class);
    }

    @Override
    public boolean modifyStore(ModifyStoreRequest modifyStoreRequest) {
        return manageStoreCrudService.modifyStore(modifyStoreRequest);
    }

    @Override
    public boolean deleteStore(Long id) {
        return manageStoreCrudService.deleteStore(id);
    }

    @Override
    public FindStoreResponse getCurrentStore() {
        Store store = manageStoreCrudService.getCurrentStore();
        return mapper.map(store, FindStoreResponse.class);
    }

    @Override
    public List<FindStoreResponse> getAllStores() {
        return manageStoreCrudService.getAllStores();
    }

    @Override
    public Boolean createDelivery(CreateDeliveryRequest createDeliveryRequest) {
        return manageDeliveryService.createDelivery(createDeliveryRequest);
    }

}
