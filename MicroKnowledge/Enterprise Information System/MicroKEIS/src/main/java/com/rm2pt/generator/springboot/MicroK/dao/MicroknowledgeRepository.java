package com.rm2pt.generator.springboot.MicroK.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public interface MicroknowledgeRepository extends JpaRepository<Microknowledge, Integer> ,JpaSpecificationExecutor<Microknowledge>{
	List<Microknowledge> findByBelongedUser(User user);
			Microknowledge findById(String id);
			List<Microknowledge> findByKeywords(Object keywords);
}
