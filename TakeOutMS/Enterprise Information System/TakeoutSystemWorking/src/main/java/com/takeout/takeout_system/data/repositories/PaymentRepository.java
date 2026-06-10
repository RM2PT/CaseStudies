package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
