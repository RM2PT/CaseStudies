package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.key.MyKey;
import com.example.dlmodelsystemservice.key.MyKeyRepository;
import com.example.dlmodelsystemservice.model.Model;
import com.example.dlmodelsystemservice.model.ModelRepository;
import com.example.dlmodelsystemservice.runningmodel.RunningModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DLModelMS1System {
    private static final Logger LOGGER = LogManager.getLogger(DLModelMS1System.class);

    @Autowired
    MyKeyRepository myKeyRepository;
    @Autowired
    ModelRepository modelRepository;

    /* Temporary Variables */
    public static Model currentModel;
    public static RunningModel currentRunningModel;

    public String callModel(String keyId) {
        try {
            MyKey obj = myKeyRepository.getKeyByUuid(keyId);
            if(obj != null && obj.isValid()) {
                return obj.getBelongedRunningModel().getApi();
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return "";
    }

    public Model viewModel(String modelId) {
        try {
            Model model = modelRepository.getModelsId(modelId);
            if(model != null) {
                return model;
            }
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return null;  //should be optional sent here
    }


}
