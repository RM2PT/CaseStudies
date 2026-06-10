package com.rm2pt.generator.springboot.TakeOutMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import com.rm2pt.generator.springboot.TakeOutMS.entity.*;

public interface CardPaymentRepository extends JpaRepository<CardPayment, Integer> ,JpaSpecificationExecutor<CardPayment>{
}
