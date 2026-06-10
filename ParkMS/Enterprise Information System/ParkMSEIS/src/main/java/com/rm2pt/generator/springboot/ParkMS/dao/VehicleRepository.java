package com.rm2pt.generator.springboot.ParkMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> ,JpaSpecificationExecutor<Vehicle>{
	List<Vehicle> findByOwnedMember(Member member);
			Vehicle findById(String id);
			Vehicle findByPlateNumber(Object plateNumber);
}
