package com.takeout.takeout_system.controllers;

import com.takeout.takeout_system.data.dto.CreateItemRequest;

import com.takeout.takeout_system.data.dto.ModifyItemRequest;

import com.takeout.takeout_system.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/store/{id}")
    public ResponseEntity<?> enterStore(@PathVariable Long id){
       return ResponseEntity.ok(businessService.enterStore(id));
    }

    @GetMapping("/sale/{id}")
    public ResponseEntity<?> getSaleBy(@PathVariable Long id){
        return ResponseEntity.ok(businessService.getSaleBy(id));
    }

    @GetMapping("/sale/{name}")
    public ResponseEntity<?> getSaleBy(@PathVariable String name){
        return ResponseEntity.ok(businessService.getSaleBy(name));
    }

    @PostMapping("/item")
    public ResponseEntity<?> createItem(@RequestBody CreateItemRequest createItemRequest){
        return ResponseEntity.ok(businessService.createItem(createItemRequest));
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<?> findItem(@PathVariable Long id){
        return ResponseEntity.ok(businessService.findItem(id));
    }
    @GetMapping("/item/{name}")
    public ResponseEntity<?> findBy(@PathVariable String name){
        return ResponseEntity.ok(businessService.findBy(name));
    }
    @PostMapping("/item/update/{id}")
    public ResponseEntity<?> modifyItem(@PathVariable Long id, @RequestBody ModifyItemRequest modifyItemRequest) {
        return ResponseEntity.ok(businessService.modifyItem(id, modifyItemRequest));
    }
    @DeleteMapping("/item/delete/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable Long id){
        return ResponseEntity.ok(businessService.deleteItem(id));
    }
    @GetMapping("/item/all")
    public ResponseEntity<?> getAllItems(){
        return ResponseEntity.ok(businessService.getAllItems());
    }

    @GetMapping("/excursion-order/{id}")
    public ResponseEntity<?> excursionPublicOrder(@PathVariable Long id){
        return ResponseEntity.ok(businessService.excursionPublicOrder(id));
    }
}
