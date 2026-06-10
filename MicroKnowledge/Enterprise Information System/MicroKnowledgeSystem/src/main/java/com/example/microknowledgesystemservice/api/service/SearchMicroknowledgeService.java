package com.example.microknowledgesystemservice.api.service;

import com.example.microknowledgesystemservice.comment.CommentRepository;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledgeRepository;
import com.example.microknowledgesystemservice.user.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchMicroknowledgeService {
    private static final Logger LOGGER = LogManager.getLogger(ListMicroKnowledgeOfUserService.class);

    final UserRepository userRepository;
    final MicroKnowledgeRepository microKnowledgeRepository;
    final CommentRepository commentRepository;
    final MicroKnowledgeSystem microKnowledgeSystem;


    public SearchMicroknowledgeService(UserRepository userRepository, MicroKnowledgeRepository microKnowledgeRepository,
                                       CommentRepository commentRepository, MicroKnowledgeSystem microKnowledgeSystem) {
        this.userRepository = userRepository;
        this.microKnowledgeRepository = microKnowledgeRepository;
        this.commentRepository = commentRepository;
        this.microKnowledgeSystem = microKnowledgeSystem;
    }

    public List<MicroKnowledge> searchMicroKnowledge(String keywords) {
        List<MicroKnowledge> microKnowledge = new ArrayList<>();
        try {
            microKnowledge = microKnowledgeRepository.getMicroKnowledgeByKeywords(keywords);
            LOGGER.info("MicroKnowledge list size "+microKnowledge.size());

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return microKnowledge;
    }

    public MicroKnowledge viewMicroKnowledge(String uuid) {
        MicroKnowledge microKnowledge = new MicroKnowledge();
        try {
            LOGGER.info("uuid: "+uuid);
            microKnowledge = microKnowledgeRepository.getMicroKnowledgeByUUid(uuid);
            if( microKnowledge != null) {
                microKnowledgeSystem.currentMicroKnowledge = microKnowledge; //setting this to current MK
                LOGGER.info("Micro knowledge has set to CCurrent MK");
                return microKnowledge;
            }
            else {
                throw new RuntimeException("No data found against provided UUID");
            }
        } catch (Exception e) {
            //need to throw Exception here
            LOGGER.info(e.getMessage(), e);
        }
        return microKnowledge;
    }
}
