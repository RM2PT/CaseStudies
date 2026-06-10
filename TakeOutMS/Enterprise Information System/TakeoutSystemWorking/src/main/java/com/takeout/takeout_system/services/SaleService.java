package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.FindSaleResponse;
import com.takeout.takeout_system.data.models.Sale;

import java.util.List;

public interface SaleService {
    Boolean addSale(Sale sale);
    Sale getSaleBy(Long id);
    Sale getSaleBy(String name);
    Sale getCurrentSale();
    void deleteSale(Long id);
    List<Sale> getAllSales();
}
