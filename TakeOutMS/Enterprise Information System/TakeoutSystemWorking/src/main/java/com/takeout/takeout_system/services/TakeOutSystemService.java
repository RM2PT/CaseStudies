package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.models.Store;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;

import java.util.Set;

public interface TakeOutSystemService {
    Boolean acceptOrder(String name) throws SaleNotFoundException;
    Boolean terminateOrder(String name) throws SaleNotFoundException;
    Set<Sale> excursionPublicOrder(Long id);
    Boolean enterStore(Long id);
    Item search(String name);
}
