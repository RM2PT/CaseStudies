package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.CreateDeliveryRequest;
import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.repositories.DeliveryRepository;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ManageDeliveryServiceImpl implements ManageDeliveryService{
    private DeliveryRepository deliveryRepository;
    private TakeOutSystemService takeOutSystemService;


    @Autowired
    public void setDeliveryRepository(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Autowired
    public void setTakeOutSystemService(TakeOutSystemService takeOutSystemService) {
        this.takeOutSystemService = takeOutSystemService;
    }

    @Override
    public Boolean createDelivery(CreateDeliveryRequest createDeliveryRequest) {
        Delivery delivery = new Delivery();
        delivery.setName(createDeliveryRequest.getName());
        delivery.setSale(new HashSet<>());
        deliveryRepository.save(delivery);
        return true;
    }

    @Override
    public Delivery findByName(String name) {
        return deliveryRepository.findByName(name);
    }

    @Override
    public Delivery getDeliveryBy(Long id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    @Override
    public Delivery getCurrentDelivery() {
        return deliveryRepository.findByIsCurrentDeliveryIsTrue();
    }

    @Override
    public Boolean acceptOrder(String name) throws SaleNotFoundException {
        return takeOutSystemService.acceptOrder(name);
    }

    @Override
    public Boolean terminateOrder(String name) throws SaleNotFoundException {
        return takeOutSystemService.terminateOrder(name);
    }

    @Override
    public Set<Sale> excursionPublicOrder(Long id) {
        return takeOutSystemService.excursionPublicOrder(id);
    }
}
