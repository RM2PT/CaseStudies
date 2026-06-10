package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.dataset.DataSet;
import com.example.dlmodelsystemservice.key.MyKey;
import com.example.dlmodelsystemservice.key.MyKeyRepository;
import com.example.dlmodelsystemservice.model.Model;
import com.example.dlmodelsystemservice.model.ModelRepository;
import com.example.dlmodelsystemservice.runningmodel.RunningModel;
import com.example.dlmodelsystemservice.runningmodel.RunningModelRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class DeployModelService {
    private static final Logger LOGGER = LogManager.getLogger(DeployModelService.class);

    @Autowired
    DLModelMS1System dlModelMS1System;
    @Autowired
    RunningModelRepository runningModelRepository;
    @Autowired
    ModelRepository modelRepository;

    @Autowired
    MyKeyRepository myKeyRepository;


    public boolean deployModel(String runningModelId, String assignedResource, String api) {
        Model currentModel = DLModelMS1System.currentModel;
        try {
            RunningModel obj = runningModelRepository.getRunningModelByUuid(runningModelId);
            if(obj == null && currentModel != null ) {
                RunningModel runningModel = new RunningModel();
                runningModel.setAssignedResource(assignedResource);
                runningModel.setApi(api);
                runningModel.setUuid(UUID.randomUUID().toString());
                runningModel.setBelongedModel(currentModel);
                runningModel.setModel(currentModel);
                currentModel.setRunningModel(runningModel);

                Set<RunningModel> runningModels = new HashSet<>();
                runningModels.add(runningModel);
                currentModel.setContainedRunningModel(runningModels);

                Model model = modelRepository.save(DLModelMS1System.currentModel);

                dlModelMS1System.currentRunningModel = model.getRunningModel();
                return true;
            }
            else {
                LOGGER.info("Object already exists of current Model does not exist");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }

        return false;
    }


    public boolean createKey(String keyId) {
        RunningModel currentRunningModel = DLModelMS1System.currentRunningModel;
        try {
            MyKey obj = myKeyRepository.getKeyByUuid(keyId);
            if(obj == null) {
               MyKey myKey = new MyKey();
               myKey.setUuid(UUID.randomUUID().toString());
               myKey.setValid(true);
               myKey.setBelongedRunningModel(currentRunningModel);
               myKey.setKeyRunningModel(currentRunningModel);
               Set<MyKey> myKeys = new HashSet<>();
               myKeys.add(myKey);
               currentRunningModel.setContainedKey(myKeys);
               runningModelRepository.save(currentRunningModel);

               return true;
            }
            else {
                LOGGER.info("Object already exists of current Model does not exist");
                return false;
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }

        return false;
    }


}
