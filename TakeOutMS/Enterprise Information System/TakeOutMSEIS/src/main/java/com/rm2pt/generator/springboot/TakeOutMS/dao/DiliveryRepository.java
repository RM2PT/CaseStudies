package com.rm2pt.generator.springboot.TakeOutMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public interface DiliveryRepository extends JpaRepository<Dilivery, Integer> ,JpaSpecificationExecutor<Dilivery>{
			Dilivery findById(String id);
}
