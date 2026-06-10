package com.example.takeoutsystemservice.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    @Query("select store from Store store where store.uuid = :uuid")
    Store getStoreById(@Param("uuid") String uuid);


}
