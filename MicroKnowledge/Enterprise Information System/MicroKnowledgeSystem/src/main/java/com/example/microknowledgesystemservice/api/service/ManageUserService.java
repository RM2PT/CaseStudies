package com.example.microknowledgesystemservice.api.service;

import com.example.microknowledgesystemservice.user.User;
import com.example.microknowledgesystemservice.user.UserRepository;
import io.cucumber.java.an.E;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ManageUserService {
    private static final Logger LOGGER = LogManager.getLogger(ManageUserService.class);

    final UserRepository userRepository;

    public ManageUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean createUser(String name, String userId, String password) {
        try {
            List<User> existingUsers = userRepository.findAll();
            if(!existingUsers.stream().anyMatch(user -> user.getUserId().equalsIgnoreCase(userId))){
                User user = new User();
                user.setUuid(UUID.randomUUID().toString());
                user.setName(name);
                user.setPassword(password);
                user.setUserId(userId); // should be email which cannot be duplicate
                userRepository.save(user);
                LOGGER.info("User has created with name: "+user.getName());
                return true;
            }
            else {
                LOGGER.info("UserId already exists: userID "+userId);
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

}
