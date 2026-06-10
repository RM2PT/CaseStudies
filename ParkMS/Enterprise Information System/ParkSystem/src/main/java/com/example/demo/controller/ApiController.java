package com.example.demo.controller;

import com.example.demo.model.Type;
import com.example.demo.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
@CrossOrigin("*")
public class ApiController {

    private final RegisterService registerService;

    @Autowired
    public ApiController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/member")
    public ResponseEntity<String> registerMemberApi(@RequestParam long id, @RequestParam String name){
        log.info("New Request: Member: id: " + id + " name: " + name);
        if(registerService.registerMember(id, name)){
            return ResponseEntity.ok("");
        }else{
            return ResponseEntity.badRequest().body("");
        }
    }

    @PostMapping("/vehicle")
    public ResponseEntity<String> registerVehicleApi(@RequestParam long id, @RequestParam String plateNumber, @RequestParam Type type){
        log.info("New Request: Vehicle: id: " + id + " plate Number: " + plateNumber + " type: " + type);
        if(registerService.registerVehicle(id, plateNumber, type)){
            return ResponseEntity.ok("");
        }else{
            return ResponseEntity.badRequest().body("");
        }
    }
}
