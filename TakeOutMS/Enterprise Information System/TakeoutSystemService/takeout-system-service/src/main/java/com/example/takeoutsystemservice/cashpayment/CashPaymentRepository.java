package com.example.takeoutsystemservice.cashpayment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashPaymentRepository extends JpaRepository<CashPayment, Long> {

}
