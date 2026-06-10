package com.takeout.takeout_system.controllers;

import com.takeout.takeout_system.data.dto.EnterItemRequest;
import com.takeout.takeout_system.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("/order/new")
    public ResponseEntity<?> makeNewOrder(){
        return ResponseEntity.ok(customerService.makeNewOrder());
    }
    @PostMapping("/item/enter")
    public ResponseEntity<?> enterItem(@RequestBody EnterItemRequest enterItemRequest){
        return ResponseEntity.ok(customerService.enterItem(enterItemRequest));
    }
    @GetMapping("/order/end")
    public ResponseEntity<?> endOrder(){
        return ResponseEntity.ok(customerService.endOrder());
    }

    @PostMapping("/payment/cash")
    public ResponseEntity<?> makeCashPayment(@RequestParam BigDecimal amount){
        return ResponseEntity.ok(customerService.makeCashPayment(amount));
    }
    @GetMapping("/item/search/{name}")
    public ResponseEntity<?> search(@PathVariable String name){
        return ResponseEntity.ok(customerService.search(name));
    }

    @GetMapping("/store/enter/{id}")
    public ResponseEntity<?> enterStore(@PathVariable Long id){
        return ResponseEntity.ok(customerService.enterStore(id));
    }

    @GetMapping("/sale/{id}")
    public ResponseEntity<?> getSale(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getSale(id));
    }
}
