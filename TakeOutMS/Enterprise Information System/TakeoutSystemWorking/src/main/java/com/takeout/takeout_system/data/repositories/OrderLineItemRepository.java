package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Long> {
}
