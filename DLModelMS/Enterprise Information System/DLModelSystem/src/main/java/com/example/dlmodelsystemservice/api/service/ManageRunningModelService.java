package com.example.dlmodelsystemservice.api.service;

import com.example.dlmodelsystemservice.key.MyKey;
import com.example.dlmodelsystemservice.key.MyKeyRepository;
import com.example.dlmodelsystemservice.runningmodel.RunningModel;
import com.example.dlmodelsystemservice.runningmodel.RunningModelRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageRunningModelService {
    private static final Logger LOGGER = LogManager.getLogger(ManageRunningModelService.class);


    @Autowired
    MyKeyRepository myKeyRepository;
    @Autowired
    RunningModelRepository runningModelRepository;


    public boolean modifyRunningModel(String runningModelId, String assignedResource, String api) {
        try{
            RunningModel runningModel = runningModelRepository.getRunningModelByUuid(runningModelId);
            if(runningModel != null) {
                runningModel.setAssignedResource(assignedResource);
                runningModel.setApi(api);
                runningModelRepository.save(runningModel);
                return true;
            }
            else {
                LOGGER.info("No Object found against Id: "+runningModelId);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;
    }

    public boolean modifyKey(String keyId, boolean isValid) {
        try{
            MyKey myKey = myKeyRepository.getKeyByUuid(keyId);
            if(myKey != null) {
                myKey.setValid(isValid);
                myKeyRepository.save(myKey);
                return true;
            }
            else {
                LOGGER.info("No Object found against Id: "+keyId);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return false;

    }




}
