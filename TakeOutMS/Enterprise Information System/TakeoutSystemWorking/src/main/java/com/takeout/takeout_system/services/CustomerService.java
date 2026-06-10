package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.EnterItemRequest;
import com.takeout.takeout_system.data.dto.FindCustomerResponse;
import com.takeout.takeout_system.data.models.Customer;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;

import java.math.BigDecimal;

public interface CustomerService {
    FindCustomerResponse getCustomerById(Long id);
    Boolean makeNewOrder();
    boolean enterItem(EnterItemRequest enterItemRequest);
    BigDecimal endOrder();
    Boolean makeCashPayment(BigDecimal amount);
    Item search(String name);
    Boolean enterStore(Long id);
    Sale getSale(Long id);
}
