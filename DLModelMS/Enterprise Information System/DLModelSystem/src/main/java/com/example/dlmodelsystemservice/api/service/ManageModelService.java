package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.dataset.DataSet;
import com.example.dlmodelsystemservice.dataset.DataSetRepository;
import com.example.dlmodelsystemservice.model.Model;
import com.example.dlmodelsystemservice.model.ModelRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageModelService {
    private static final Logger LOGGER = LogManager.getLogger(UploadModelService.class);

    @Autowired
    DLModelMS1System dlModelMS1System;
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    DownloadModelService downloadModelService;
    @Autowired
    DataSetRepository dataSetRepository;

    public boolean updateModelInformation(String id, String title, String keyword, String version, String description) {
        try{
            Model model = dlModelMS1System.viewModel(id);
            if(model != null) {
                model.setTitle(title);
                model.setKeyword(keyword);
                model.setVersion(version);
                model.setDescription(description);
                modelRepository.save(model);
                return true;
            }
            else {
                LOGGER.info("No Object found against Id: "+id);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean updateDatSet(String id, String content) {
        try{
            DataSet dataSet = dataSetRepository.getDsByUuid(id);
            if(dataSet != null) {
                dataSet.setContent(content);
                dataSetRepository.save(dataSet);
                return true;
            }
            else {
                LOGGER.info("No Object found against Id: "+id);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

}
