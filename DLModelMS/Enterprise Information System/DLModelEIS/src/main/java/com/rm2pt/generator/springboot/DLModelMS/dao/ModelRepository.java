package com.rm2pt.generator.springboot.DLModelMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public interface ModelRepository extends JpaRepository<Model, Integer> ,JpaSpecificationExecutor<Model>{
	List<Model> findByModeltoAttachment(Attachment attachment);
			Model findById(String id);
			List<Model> findByKeyword(Object keyword);
}
