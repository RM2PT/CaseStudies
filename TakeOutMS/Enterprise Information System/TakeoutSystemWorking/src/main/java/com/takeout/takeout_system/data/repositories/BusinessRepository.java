package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business, Long> {
}
