package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.EnterItemRequest;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface ProcessOrderService {
    Boolean makeNewOrder();
    boolean enterItem(EnterItemRequest enterItemRequest);
    BigDecimal endOrder();
    Boolean makeCashPayment(BigDecimal amount);
}
