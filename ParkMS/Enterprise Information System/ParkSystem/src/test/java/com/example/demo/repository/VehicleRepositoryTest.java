package com.example.demo.repository;


import com.example.demo.model.Vehicle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataMongoTest
public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository vehicleRepository;


    @Before
    public void setUp(){

        Vehicle vehicle = Vehicle.builder().id(1L).build();

        vehicleRepository.save(vehicle);
    }

    @Test
    public void findById() {
        Optional<Vehicle> result = vehicleRepository.findById(1L);

        assertThat(result.isPresent()).isEqualTo(true);
    }
}
