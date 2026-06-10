package com.rm2pt.generator.springboot.TakeOutMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public interface ItemRepository extends JpaRepository<Item, Integer> ,JpaSpecificationExecutor<Item>{
	List<Item> findByItemtoProductCatalog(ProductCatalog productCatalog);
	List<Item> findByItemtoStore(Store store);
			Item findById(String id);
			Item findByNameAndItemtoStore(Object itemname,Object CurrentStore);
}
