package com.rm2pt.generator.springboot.DLModelMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.DLModelMS.entity.*;

public interface DataSetRepository extends JpaRepository<DataSet, Integer> ,JpaSpecificationExecutor<DataSet>{
			DataSet findById(String id);
}
