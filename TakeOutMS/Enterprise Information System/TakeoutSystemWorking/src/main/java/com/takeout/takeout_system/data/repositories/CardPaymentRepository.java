package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.CardPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardPaymentRepository extends JpaRepository<CardPayment, Long> {
}
