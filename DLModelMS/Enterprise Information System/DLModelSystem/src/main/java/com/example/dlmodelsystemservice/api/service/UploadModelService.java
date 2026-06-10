package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.api.controller.DlSystemController;
import com.example.dlmodelsystemservice.attachment.Attachment;
import com.example.dlmodelsystemservice.attachment.AttachmentRepository;
import com.example.dlmodelsystemservice.dataset.DataSet;
import com.example.dlmodelsystemservice.dataset.DataSetRepository;
import com.example.dlmodelsystemservice.model.Model;
import com.example.dlmodelsystemservice.model.ModelRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Service
public class UploadModelService {

    private static final Logger LOGGER = LogManager.getLogger(UploadModelService.class);

    @Autowired
    DLModelMS1System dlModelMS1System;
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    DataSetRepository dataSetRepository;


    @Autowired
    ThirdPartyServices thirdPartyServices;
    public boolean uploadModelInformation(String id, String title, String keyword, String version, String description) {
        Model model = new Model();
        try {
            Model obj = modelRepository.getModelsId(id);
            if(obj == null) {
                model.setTitle(title);
                model.setKeyword(keyword);
                model.setVersion(version);
                model.setDescription(description);
                model.setUuid(UUID.randomUUID().toString());
                modelRepository.save(model);
                dlModelMS1System.currentModel = model;
                LOGGER.info("Model has saved and set to current Model");
                return true;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean uploadModelAttachment() {
        try {
            Attachment attachment = new Attachment();
            attachment.setUrl(thirdPartyServices.generateUrl());
            attachment.setUuid(UUID.randomUUID().toString());
            attachment.setModel(DLModelMS1System.currentModel);
            dlModelMS1System.currentModel.setModelToAttachment(attachment);
            modelRepository.save(DLModelMS1System.currentModel);

            LOGGER.info("Model Attachment has saved");
            return true;

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean uploadDataSet(String content, String uuid) {
        try {
            DataSet prevObj = dataSetRepository.getDsByUuid(uuid);
            if(prevObj == null && dlModelMS1System.currentModel != null) {
                DataSet dataSet = new DataSet();
                dataSet.setContent(content);
                dataSet.setUuid(UUID.randomUUID().toString());
                dataSet.setModel(DLModelMS1System.currentModel);

                Set<DataSet> dataSets = new HashSet<>();
                dataSets.add(dataSet);
                DLModelMS1System.currentModel.setContainedDataSet(dataSets);

                modelRepository.save(DLModelMS1System.currentModel);

                LOGGER.info("Data Set has saved and set in Current Model");
                return true;
            }
            else {
                LOGGER.info("Data set already Exists or Current System Model is null");
                return false;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }
}
