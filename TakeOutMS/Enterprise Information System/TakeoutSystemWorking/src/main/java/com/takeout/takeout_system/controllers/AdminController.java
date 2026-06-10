package com.takeout.takeout_system.controllers;

import com.takeout.takeout_system.data.dto.*;

import com.takeout.takeout_system.services.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private AdministratorService administratorService;

    @Autowired
    public void setAdministratorService(AdministratorService administratorService) {
        this.administratorService = administratorService;
    }


    @GetMapping("/customer/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable Long id){
        return ResponseEntity.ok(administratorService.getCustomerById(id));
    }

    @PostMapping("/store/create")
    public ResponseEntity<?> createStore(@RequestBody CreateStoreRequest createStoreRequest){
       return ResponseEntity.ok(administratorService.createStore(createStoreRequest));
    }

    @GetMapping("/store/{id}")
    public ResponseEntity<?> findStore(@PathVariable Long id){
        return ResponseEntity.ok(administratorService.findStore(id));
    }

    @PostMapping("/store/modify")
    public ResponseEntity<?> modifyStore(ModifyStoreRequest modifyStoreRequest){
        return ResponseEntity.ok(administratorService.modifyStore(modifyStoreRequest));
    }

    @DeleteMapping("/store/{id}")
    public ResponseEntity<?> deleteStore(@PathVariable Long id){
        return ResponseEntity.ok(administratorService.deleteStore(id));
    }

    @GetMapping("/store/current")
    public ResponseEntity<?> getCurrentStore(){
        return ResponseEntity.ok(administratorService.getCurrentStore());
    }

    @GetMapping("/store/all")
    public ResponseEntity<?> getAllStores(){
        return ResponseEntity.ok(administratorService.getAllStores());
    }

    @PostMapping("/delivery/create")
    public ResponseEntity<?> createDelivery(@RequestBody CreateDeliveryRequest createDeliveryRequest){
        return ResponseEntity.ok(administratorService.createDelivery(createDeliveryRequest));
    }
}
