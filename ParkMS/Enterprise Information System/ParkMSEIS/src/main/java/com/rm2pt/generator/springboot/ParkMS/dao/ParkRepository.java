package com.rm2pt.generator.springboot.ParkMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public interface ParkRepository extends JpaRepository<Park, Integer> ,JpaSpecificationExecutor<Park>{
			Park findById(String id);
}
