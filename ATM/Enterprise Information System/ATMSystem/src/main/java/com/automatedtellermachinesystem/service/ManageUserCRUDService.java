package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.User;
import com.automatedtellermachinesystem.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this service includes these methods: createUser queryUser modifyUser deleteUser
 */
@Slf4j
@Service
public class ManageUserCRUDService {

    private final UserRepository userRepository;

    @Autowired
    public ManageUserCRUDService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean createUser(int userId, String name, String address) {
        try {
            userRepository.save(
                    this.setUserFields(new User(), userId, name, address));
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return false;
        }
        return true;
    }

    public User queryUser(int userId) {
        return userRepository.findByUserId(userId);
    }

    public boolean modifyUser(int userId, String name, String address) {
        try {
            User oldUser = this.queryUser(userId);
            this.setUserFields(oldUser, userId, name, address);
            userRepository.save(oldUser);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean deleteUser(int userId) {
        try {
            User user = this.queryUser(userId);
            if (user != null) {
                userRepository.delete(user);
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return false;
        }

        return true;
    }

    private User setUserFields(User user, int userId, String name,
                               String address) {
        user.setUserId(userId);
        user.setAddress(address);
        user.setName(name);
        return user;
    }

}
