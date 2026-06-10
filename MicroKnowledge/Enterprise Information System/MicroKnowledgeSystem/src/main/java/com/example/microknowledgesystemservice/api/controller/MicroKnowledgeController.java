package com.example.microknowledgesystemservice.api.controller;

import com.example.microknowledgesystemservice.api.service.*;
import com.example.microknowledgesystemservice.microknowledge.MicroKnowledge;
import com.example.microknowledgesystemservice.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = {"/MicroKnowledge"})
@CrossOrigin("*")
public class MicroKnowledgeController {
    private static final Logger LOGGER = LogManager.getLogger(MicroKnowledgeController.class);

    final ManageUserService manageUserService;
    final ManageMicroKnowledgeService manageMicroKnowledgeService;
    final MicroKnowledgeSystem microKnowledgeSystem;
    final ListMicroKnowledgeOfUserService listMicroKnowledgeOfUserService;
    final SearchMicroknowledgeService searchMicroknowledgeService;

    public MicroKnowledgeController(ManageMicroKnowledgeService manageMicroKnowledgeService, ManageUserService manageUserService,
                                    MicroKnowledgeSystem microKnowledgeSystem, ListMicroKnowledgeOfUserService listMicroKnowledgeOfUserService,
                                    SearchMicroknowledgeService searchMicroknowledgeService) {
        this.manageMicroKnowledgeService = manageMicroKnowledgeService;
        this.manageUserService = manageUserService;
        this.microKnowledgeSystem = microKnowledgeSystem;
        this.listMicroKnowledgeOfUserService = listMicroKnowledgeOfUserService;
        this.searchMicroknowledgeService = searchMicroknowledgeService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public boolean createMicroKnowledge(@RequestParam("keywords") String keywords, @RequestParam("content") String content,
                                        @RequestParam("uuid") String uuid) {
        LOGGER.info("Request received for MK creation");
        return manageMicroKnowledgeService.createMicroKnowledge(uuid, keywords, content);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    public boolean modifyMicroKnowledge(@RequestParam("uuid") String uuid, @RequestParam("keywords") String keywords,
                                        @RequestParam("content") String content) {
        LOGGER.info("Request received for user creation");
        return manageMicroKnowledgeService.modifyMicroKnowledge(uuid, keywords, content);
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    @ResponseBody
    public MicroKnowledge viewMicroKnowledge(@RequestParam("id") String id) {
        LOGGER.info("Request received for user creation");
        return searchMicroknowledgeService.viewMicroKnowledge(id);
    }

    @RequestMapping(value = "/starMircoKnowledge", method = RequestMethod.GET)
    @ResponseBody
    public boolean starMircoKnowledge() {
        LOGGER.info("Request received for user creation");
        return microKnowledgeSystem.starMicroKnowledge();
    }

    @RequestMapping(value = "/listStaredMicroKnowledge", method = RequestMethod.GET)
    @ResponseBody
    public Set<MicroKnowledge> listStaredMicroKnowledge() {
        LOGGER.info("Request received for user creation");
        return microKnowledgeSystem.listStaredMicroKnowledge();
    }

    @RequestMapping(value = "/writeComment", method = RequestMethod.POST)
    @ResponseBody
    public boolean writeComment(@RequestParam("content") String content) {
        LOGGER.info("Request received for user creation");
        return microKnowledgeSystem.writeComment(content);
    }

    /*
    * User Apis
    * */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public boolean createUser(@RequestParam("name") String name, @RequestParam("password") String password,
                              @RequestParam("userId") String userId) {
        LOGGER.info("Request received for user creation");
        return manageUserService.createUser(name, userId, password);
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public boolean doLogin(@RequestParam("userId") String userId, @RequestParam("password") String password) {
        LOGGER.info("Request received for user creation");
        return microKnowledgeSystem.doLogin(userId, password);
    }

    @RequestMapping(value = "/user/search", method = RequestMethod.GET)
    @ResponseBody
    public List<User> searchUserByName(@RequestParam("name") String name) {
        LOGGER.info("Request received for user creation");
        return listMicroKnowledgeOfUserService.searchUserByName(name);
    }

}
