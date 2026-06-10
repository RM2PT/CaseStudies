package com.automatedtellermachinesystem.repository;

import com.automatedtellermachinesystem.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(int userId);

    List<User> findAll();

    User save(User user);

    void delete(User user);
}