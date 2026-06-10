package com.rm2pt.generator.springboot.MicroK.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.MicroK.entity.*;

public interface UserRepository extends JpaRepository<User, Integer> ,JpaSpecificationExecutor<User>{
			User findById(String id);
			List<User> findByName(Object name);
}
