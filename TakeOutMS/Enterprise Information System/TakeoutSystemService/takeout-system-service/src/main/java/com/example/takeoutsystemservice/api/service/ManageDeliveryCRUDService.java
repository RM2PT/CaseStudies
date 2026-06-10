package com.example.takeoutsystemservice.api.service;

import com.example.takeoutsystemservice.api.controller.TakeOutController;
import com.example.takeoutsystemservice.delivery.Delivery;
import com.example.takeoutsystemservice.delivery.DeliveryRepository;
import com.example.takeoutsystemservice.sale.Sale;
import com.example.takeoutsystemservice.sale.SaleRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class ManageDeliveryCRUDService {
    private static final Logger LOGGER = LogManager.getLogger(ManageDeliveryCRUDService.class);

    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private SaleRepository saleRepository;


    public boolean createDelivery(String id, String name) {
        try{
            if(null==deliveryRepository.getDeliveryByUuid(id)) {
                Delivery delivery = new Delivery();
                delivery.setName(name);
                delivery.setUuid(UUID.randomUUID().toString());
                deliveryRepository.save(delivery);
                TakeOutSystem.currentDelivery = delivery;
                LOGGER.info("Delivery has saved");
                return true;
            }
            else {
                LOGGER.info("Object already exist: ");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean acceptOrder(String saleName) {
        try {
            Sale sale =saleRepository.getSaleByName(saleName);
            Delivery currentDelivery = TakeOutSystem.currentDelivery;

            if(sale != null && !sale.isAccept()) {
                sale.setAccept(true);
                sale.setSaleToDelivery(currentDelivery);
                Set<Sale> saleSet = new HashSet<>();
                saleSet.add(sale);
                currentDelivery.setDeliveryToSale(saleSet);
                sale.setDelivery(currentDelivery);
                saleRepository.save(sale);
                LOGGER.info("Sale Order has accepted");
                return true;
            }
            else {
                LOGGER.info("Sale Object is null: ");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

}
