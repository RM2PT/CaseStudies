package com.example.demo.service;

import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.model.Member;
import com.example.demo.model.Type;
import com.example.demo.model.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class RegisterService {

    private final MemberRepository memberRepository;
    private final VehicleRepository vehicleRepository;

    private final ParkMSSystem parkMSSystem;

    @Autowired
    public RegisterService(MemberRepository memberRepository, VehicleRepository vehicleRepository, ParkMSSystem parkMSSystem) {
        this.memberRepository = memberRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkMSSystem = parkMSSystem;
    }

    public Boolean registerMember(long memberID, String name){
        if(memberRepository.findById(memberID).isPresent()) {
            return false;
        }else{
            Member member = Member.builder().id(memberID).name(name).owningVehicles(new ArrayList<Vehicle>()).build();
            memberRepository.save(member);
            parkMSSystem.setCurrentMember(member);
            return true;
        }
    }

    public Boolean registerVehicle(long vehicleID, String plateNumber, Type type){
        if(vehicleRepository.findById(vehicleID).isPresent() || Objects.isNull(parkMSSystem.getCurrentMember())) {
            return false;
        }else{
            Vehicle vehicle = Vehicle.builder().id(vehicleID).plateNumber(plateNumber).type(type).build();
            vehicleRepository.save(vehicle);
            parkMSSystem.getCurrentMember().getOwningVehicles().add(vehicle);
            vehicle.setOwnedMember(parkMSSystem.getCurrentMember());
            return true;
        }
    }
}
