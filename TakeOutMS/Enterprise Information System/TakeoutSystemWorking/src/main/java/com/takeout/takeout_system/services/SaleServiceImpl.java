package com.takeout.takeout_system.services;

import com.takeout.takeout_system.data.dto.FindSaleResponse;
import com.takeout.takeout_system.data.models.Sale;
import com.takeout.takeout_system.data.repositories.SaleRepository;
import com.takeout.takeout_system.exceptions.SaleNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleRepository saleRepository;
    private final ModelMapper mapper= new ModelMapper();

    @Override
    public Boolean addSale(Sale sale) {
        saleRepository.save(sale);
        return true;
    }

    @Override
    public Sale getSaleBy(Long id) {
        return saleRepository.findById(id)
                .orElseThrow(()->new SaleNotFoundException(String.format("sale with id %d not found", id)));

    }

    @Override
    public Sale getCurrentSale(){
        return saleRepository.findByIsCurrentSaleIsTrue();
    }

    @Override
    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getSaleBy(String name) {
        return saleRepository.findByName(name);
    }
}
