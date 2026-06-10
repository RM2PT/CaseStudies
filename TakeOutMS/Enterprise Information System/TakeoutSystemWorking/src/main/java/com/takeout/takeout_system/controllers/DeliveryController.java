package com.takeout.takeout_system.controllers;

import com.takeout.takeout_system.data.dto.CreateDeliveryRequest;
import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import com.takeout.takeout_system.services.ManageDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {
    @Autowired
    private ManageDeliveryService manageDeliveryService;

    @PostMapping
    public ResponseEntity<?> createDelivery(@RequestBody CreateDeliveryRequest createDeliveryRequest){
        return ResponseEntity.ok(manageDeliveryService.createDelivery(createDeliveryRequest));
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> findByName(@PathVariable String name){
        return ResponseEntity.ok(manageDeliveryService.findByName(name));
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getDeliveryBy(@PathVariable Long id){
        return ResponseEntity.ok(manageDeliveryService.getDeliveryBy(id));
    }

    @GetMapping("/order/accept/{name}")
    public ResponseEntity<?> acceptOrder(@PathVariable String name) {
        try{
            boolean response = manageDeliveryService.acceptOrder(name);
            return ResponseEntity.ok(response);
        }catch (SaleNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }

    @GetMapping("/order/terminate/{name}")
    public ResponseEntity<?> terminateOrder(@PathVariable String name) {
        try{
            boolean response = manageDeliveryService.terminateOrder(name);
            return ResponseEntity.ok(response);
        }catch (SaleNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }

    @GetMapping("/sale/excursion-order/{id}")
    public ResponseEntity<?> excursionPublicOrder(@PathVariable Long id){
        return ResponseEntity.ok(manageDeliveryService.excursionPublicOrder(id));
    }
}
