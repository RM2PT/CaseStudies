package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    Delivery findByName(String name);
    Delivery findByIsCurrentDeliveryIsTrue();
}
