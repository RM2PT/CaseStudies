package com.example.takeoutsystemservice.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("select sale from Sale sale where sale.name =:name")
    Sale getSaleByName(@Param("name") String name);
}
