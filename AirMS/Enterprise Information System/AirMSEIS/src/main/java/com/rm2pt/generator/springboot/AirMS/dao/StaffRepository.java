package com.rm2pt.generator.springboot.AirMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.AirMS.entity.*;

public interface StaffRepository extends JpaRepository<Staff, Integer> ,JpaSpecificationExecutor<Staff>{
	Staff findByBoss(Staff staff);
			Staff findById(String id);
}
