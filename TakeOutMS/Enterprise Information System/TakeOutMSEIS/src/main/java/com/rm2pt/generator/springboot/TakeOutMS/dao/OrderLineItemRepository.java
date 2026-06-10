package com.rm2pt.generator.springboot.TakeOutMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Integer> ,JpaSpecificationExecutor<OrderLineItem>{
	List<OrderLineItem> findByOrderLineItemtoItem(Item item);
	List<OrderLineItem> findByOrderLineItemtoSale(Sale sale);
}
