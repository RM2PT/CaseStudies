package com.example.takeoutsystemservice.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT item from Item item where item.uuid =:uuid")
    Item getItemByUid(@Param("uuid") String  uuid);

    @Query("SELECT item from Item item where item.name =:name")
    Item searchItemByName(@Param("name") String  name);
}
