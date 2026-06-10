package com.rm2pt.generator.springboot.AirMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public interface DeviceRepository extends JpaRepository<Device, Integer> ,JpaSpecificationExecutor<Device>{
	List<Device> findByContacts(Staff staff);
			Device findById(String id);
}
