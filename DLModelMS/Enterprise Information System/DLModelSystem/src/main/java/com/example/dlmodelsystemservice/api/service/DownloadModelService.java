package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.model.Model;
import com.example.dlmodelsystemservice.model.ModelRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DownloadModelService {
    private static final Logger LOGGER = LogManager.getLogger(DLModelMS1System.class);

    @Autowired
    ModelRepository modelRepository;
    @Autowired
    DLModelMS1System dlModelMS1System;

    public List<Model> searchModelByKeyword(String keyword) {
        List<Model> models = new ArrayList<>();
        try {
            if(keyword != null || !keyword.equalsIgnoreCase("")) {
                models = modelRepository.getModelsByKeyword(keyword.trim());
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return models;
    }



    public boolean download(String url) {
        try{
            if(url != null) {
                return true;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean downModel(String id) {
        try {
            Model model = dlModelMS1System.viewModel(id);
            if(model != null) {
                return download(model.getModelToAttachment().getUrl());
            }
            return false;
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return false;  //should be optional sent here

    }

}
