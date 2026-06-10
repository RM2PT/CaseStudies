package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByName(String name);
}
