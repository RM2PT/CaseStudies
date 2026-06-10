package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.CashPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashPaymentRepository extends JpaRepository<CashPayment, Long> {
}
