package com.example.dlmodelsystemservice.api.controller;

import com.example.dlmodelsystemservice.api.service.*;
import com.example.dlmodelsystemservice.model.Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/DlSystem"})
@CrossOrigin("*")
public class DlSystemController {
    private static final Logger LOGGER = LogManager.getLogger(DlSystemController.class);

    @Autowired
    UploadModelService uploadModelService;
    @Autowired
    ManageModelService manageModelService;
    @Autowired
    ManageRunningModelService manageRunningModelService;
    @Autowired
    DownloadModelService downloadModelService;
    @Autowired
    DLModelMS1System dlModelMS1System;
    @Autowired
    DeployModelService deployModelService;
    @Autowired
    ThirdPartyServices thirdPartyServices;

    @PostMapping(value = "/model")
    @ResponseBody
    public boolean uploadModel(@RequestParam("id") String id, @RequestParam("title") String title, @RequestParam("keyword") String keyword,
                               @RequestParam("version") String version, @RequestParam("description") String description) {
        LOGGER.info("Request received Model creation");
        return uploadModelService.uploadModelInformation(id, title, keyword, version, description);
    }

    @PostMapping(value = "/deploy/model")
    public boolean uploadDataSet(@RequestParam("runningModelId") String runningModelId,
                                 @RequestParam("assignedResource") String assignedResource,
                                 @RequestParam("api") String api) {
        LOGGER.info("Request received for MK creation");
        return deployModelService.deployModel(runningModelId,assignedResource, api);
    }

    @PostMapping(value = "/attachment")
    public boolean uploadAttachment() {
        LOGGER.info("Request received for MK creation");
        return uploadModelService.uploadModelAttachment();
    }

    @PostMapping(value = "/dataset")
    public boolean uploadDataSet(@RequestParam("id") String id, @RequestParam("content") String content) {
        LOGGER.info("Request received for MK creation");
        return uploadModelService.uploadDataSet(content, id);
    }

    @PostMapping(value = "/createKey")
    public boolean uploadDataSet(@RequestParam("id") String id) {
        LOGGER.info("Request received for MK creation");
        return deployModelService.createKey(id);
    }

    @GetMapping(value = "/searchModel/keyword")
    public List<Model> searchModelByKeyword(@RequestParam("keyword") String keyword) {
        LOGGER.info("Request received for MK creation");
        return downloadModelService.searchModelByKeyword(keyword);
    }

    @GetMapping(value = "/callModel")
    public String callModel(@RequestParam("keyId") String keyId) {
        LOGGER.info("Request received for MK creation");
        return dlModelMS1System.callModel(keyId);
    }

    @GetMapping(value = "/view/model")
    public Model viewModel(@RequestParam("modelId") String modelId) {
        LOGGER.info("Request received for MK creation");
        return dlModelMS1System.viewModel(modelId);
    }

    @GetMapping(value = "/down/model")
    public boolean downModel(@RequestParam("modelId") String modelId) {
        LOGGER.info("Request received for MK creation");
        return downloadModelService.downModel(modelId);
    }

    @PutMapping(value = "/model/info")
    public boolean updateModelInfo(@RequestParam("id") String id, @RequestParam("title") String title, @RequestParam("keyword") String keyword,
                                   @RequestParam("version") String version, @RequestParam("description") String description) {

        LOGGER.info("Request received for MK creation");
        return manageModelService.updateModelInformation(id, title, keyword, version, description);
    }

    @PutMapping(value = "/update/dataset")
    public boolean updateDatSet(@RequestParam("id") String id, @RequestParam("content") String content) {

        LOGGER.info("Request received for MK creation");
        return manageModelService.updateDatSet(id, content);
    }

    @PutMapping(value = "/update/runningmodel")
    public boolean updateDatSet(@RequestParam("runningModelId") String runningModelId, @RequestParam("assignedResource") String assignedResource,
                                @RequestParam("api") String api) {

        LOGGER.info("Request received for MK creation");
        return manageRunningModelService.modifyRunningModel(runningModelId, assignedResource, api);
    }

    @PutMapping(value = "/update/key")
    public boolean updateDatSet(@RequestParam("keyId") String keyId, @RequestParam("isValid") boolean isValid) {

        LOGGER.info("Request received for MK creation");
        return manageRunningModelService.modifyKey(keyId, isValid);
    }

    @PostMapping(value = "/generate/url")
    public String generateUrl() {

        LOGGER.info("Request received for MK creation");
        return thirdPartyServices.generateUrl();
    }

    @PostMapping(value = "/download")
    public boolean download(@RequestParam("url") String url) {

        LOGGER.info("Request received for MK creation");
        return thirdPartyServices.download(url);
    }

    /*To Test Docker*/
    //TODO: remove after testing
    @GetMapping(value = "/test")
    public String getTestData() {
        return "System has started";
    }

}
