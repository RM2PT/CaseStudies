package com.rm2pt.generator.springboot.DLModelMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public interface MykeyRepository extends JpaRepository<Mykey, Integer> ,JpaSpecificationExecutor<Mykey>{
	List<Mykey> findByBelongedRunningModel(RunningModel runningModel);
			Mykey findById(String id);
}
