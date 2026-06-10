package com.takeout.takeout_system.data.repositories;

import com.takeout.takeout_system.data.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
