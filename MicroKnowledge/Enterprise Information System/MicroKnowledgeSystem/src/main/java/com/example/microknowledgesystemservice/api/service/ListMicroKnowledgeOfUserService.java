package com.example.microknowledgesystemservice.api.service;

import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledgeRepository;
import com.example.microknowledgesystemservice.user.User;
import com.example.microknowledgesystemservice.user.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListMicroKnowledgeOfUserService {
    private static final Logger LOGGER = LogManager.getLogger(ListMicroKnowledgeOfUserService.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    MicroKnowledgeRepository microKnowledgeRepository;

    public List<User> searchUserByName(String name) {
        List<User> users = new ArrayList<>();
        try {
            users = userRepository.getUserByName(name);
            LOGGER.info("User list: "+users.size());
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return users;
    }

    public List<MicroKnowledge> listMicroKnowledgeOfUser(String userId) {
        List<MicroKnowledge> microKnowledge = new ArrayList<>();
        try {
            User user = userRepository.getUserByUserId(userId);
            if(user != null) {
                microKnowledge = microKnowledgeRepository.getMicroKnowledgeByContainedUser(user.getUuid());
                LOGGER.info("MicroKnowledge list size "+microKnowledge.size());
            }

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return microKnowledge;
    }

}
