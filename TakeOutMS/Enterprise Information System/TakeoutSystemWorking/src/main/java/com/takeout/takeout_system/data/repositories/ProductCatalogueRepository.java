package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.ProductCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCatalogueRepository extends JpaRepository<ProductCatalogue, Long> {
}
