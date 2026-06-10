package com.example.takeoutsystemservice.delivery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    @Query("select del from Delivery del where del.uuid =:id")
    Delivery getDeliveryByUuid(@Param("id") String id);
}
