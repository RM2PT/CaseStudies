package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.models.Delivery;
import com.takeout.takeout_system.data.models.Item;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.models.Store;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Set;

@Getter
@Setter
@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class TakeOutSystemServiceImpl implements TakeOutSystemService {


    private SaleService saleService;

    private ManageDeliveryService manageDeliveryService;

    private ManageStoreCrudService manageStoreCrudService;


    private ManageItemCrudService manageItemCrudService;

    @Autowired
    public void setSaleService(SaleService saleService) {
        this.saleService = saleService;
    }

    @Autowired
    public void setManageStoreCrudService(ManageStoreCrudService manageStoreCrudService) {
        this.manageStoreCrudService = manageStoreCrudService;
    }

    @Autowired
    public void setManageItemCrudService(ManageItemCrudService manageItemCrudService) {
        this.manageItemCrudService = manageItemCrudService;
    }

    @Lazy
    @Autowired
    public void setManageDeliveryService(ManageDeliveryService manageDeliveryService) {
        this.manageDeliveryService = manageDeliveryService;
    }

    @Override
    public Boolean acceptOrder(String name) throws SaleNotFoundException {
        Sale sale = saleService.getSaleBy(name);
        if (sale==null) throw new SaleNotFoundException("no such sale found");
        Delivery currentDelivery = manageDeliveryService.getCurrentDelivery();
        sale.setAccept(true);
        sale.setDelivery(currentDelivery);
        return saleService.addSale(sale);
    }

    @Override
    public Boolean terminateOrder(String name) throws SaleNotFoundException {
        Sale foundSale = saleService.getSaleBy(name);
        if (foundSale==null) throw new SaleNotFoundException("no such sale found");
        Delivery currentDelivery = manageDeliveryService.getCurrentDelivery();
        if (foundSale.isAccept()) foundSale.setComplete(true);
        return saleService.addSale(foundSale);
    }

    @Override
    public Set<Sale> excursionPublicOrder(Long id) {
        Delivery delivery = manageDeliveryService.getDeliveryBy(id);
        if (delivery!=null) return delivery.getSale();
        return null;
    }

    @Override
    public Boolean enterStore(Long id) {
        Store store = manageStoreCrudService.findStore(id);
        Store currentStore = manageStoreCrudService.getCurrentStore();
        currentStore.setCurrentStore(false);
        manageStoreCrudService.save(currentStore);
        store.setCurrentStore(true);
        manageStoreCrudService.save(store);
        return true;
    }

    @Override
    public Item search(String name) {
        return manageItemCrudService.findBy(name);
    }
}
