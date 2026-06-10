package com.rm2pt.generator.springboot.TakeOutMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public interface SaleRepository extends JpaRepository<Sale, Integer> ,JpaSpecificationExecutor<Sale>{
	Sale findBySaletoPayment(Payment payment);
	List<Sale> findBySaletoStore(Store store);
	List<Sale> findBySaletoCutomer(Cutomer cutomer);
	List<Sale> findBySaletoDilivery(Dilivery dilivery);
			Sale findByName(Object name);
}
