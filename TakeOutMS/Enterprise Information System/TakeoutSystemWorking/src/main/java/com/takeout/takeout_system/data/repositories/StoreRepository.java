package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findByIsCurrentStoreIsTrue();
}
