package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    Sale findByName(String name);
    Sale findByIsCurrentSaleIsTrue();
}
