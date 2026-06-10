package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.model.Type;
import com.example.demo.model.Vehicle;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.VehicleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisterServiceTest {


//    @TestConfiguration
//    static class RegisterServiceTestContextConfiguration {
//
//        @Bean
//        public RegisterService registerService() {
//            return new RegisterService(memberRepository, vehicleRepository, parkMSSystem);
//        }
//    }

    @Autowired
    private RegisterService registerService;

    @MockBean
    private VehicleRepository vehicleRepository;

    @MockBean
    private ParkMSSystem parkMSSystem;
    @MockBean
    private MemberRepository memberRepository;


    @Before
    public void setUp() {
        Member member = Member.builder().id(1L).name("test").build();

        Mockito.when(memberRepository.findById(1L))
                .thenReturn(Optional.of(member));

        Vehicle vehicle = Vehicle.builder().id(1L).plateNumber("test").build();
        Mockito.when(vehicleRepository.findById(1L))
                .thenReturn(Optional.of(vehicle));
    }

    @Test
    public void registerMemberTest(){
        assertThat(registerService.registerMember(1L, "test")).isEqualTo(false);
    }

    @Test
    public void registerVehicleTest(){
        assertThat(registerService.registerVehicle(1L, "test", Type.LARGE)).isEqualTo(false);
    }
}
