package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateDeliveryRequest;
import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;

import java.util.Set;

public interface ManageDeliveryService {
    Boolean createDelivery(CreateDeliveryRequest createDeliveryRequest);
    Delivery findByName(String name);
    Delivery getDeliveryBy(Long id);
    Delivery getCurrentDelivery();
    Boolean acceptOrder(String name) throws SaleNotFoundException;
    Boolean terminateOrder(String name) throws SaleNotFoundException;
    Set<Sale> excursionPublicOrder(Long id);
}
