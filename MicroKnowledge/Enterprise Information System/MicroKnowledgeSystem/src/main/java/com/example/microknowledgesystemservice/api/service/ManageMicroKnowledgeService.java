package com.example.microknowledgesystemservice.api.service;

import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledgeRepository;
import com.example.microknowledgesystemservice.user.User;
import com.example.microknowledgesystemservice.user.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ManageMicroKnowledgeService {

    private static final Logger LOGGER = LogManager.getLogger(ManageMicroKnowledgeService.class);

    @Autowired
    UserRepository userRepository;
    @Autowired
    MicroKnowledgeRepository microknowledgeRepository;
    @Autowired
    MicroKnowledgeSystem microKnowledgeSystemService;

    public boolean createMicroKnowledge(String uuid, String keywords, String content) {
        try {
            MicroKnowledge oldMk = microknowledgeRepository.getMicroKnowledgeByUUid(uuid);
            if(oldMk == null) { //If no object exits against provided unique id (uuid)
                MicroKnowledge mk = new MicroKnowledge();
                mk.setKeywords(keywords);
                mk.setContent(content);
                mk.setUuid(UUID.randomUUID().toString());
                mk.setStarNumber(0);

                /*Setting user instances*/
                User user = microKnowledgeSystemService.currentUser;
                user.setMicroKnowledge(mk);
                mk.setBelongedUser(user);
                mk.setContainedUser(user);
                microknowledgeRepository.save(mk);
                return true;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean modifyMicroKnowledge(String uuid, String keywords, String content) {
        try {
            MicroKnowledge oldMk = microknowledgeRepository.getMicroKnowledgeByUUid(uuid);
            if(oldMk != null) {
                oldMk.setContent(content);
                oldMk.setKeywords(keywords);
                oldMk.setStarNumber(oldMk.getStarNumber()- 1);  //changes to previous value
                return true;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }
}
