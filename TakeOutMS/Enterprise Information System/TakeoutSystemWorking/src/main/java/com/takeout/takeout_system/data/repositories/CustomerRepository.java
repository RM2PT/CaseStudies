package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
