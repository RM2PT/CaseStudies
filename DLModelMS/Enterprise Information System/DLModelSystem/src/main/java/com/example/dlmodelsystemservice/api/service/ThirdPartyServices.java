package com.example.dlmodelsystemservice.api.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ThirdPartyServices {
    private static final Logger LOGGER = LogManager.getLogger(ThirdPartyServices.class);

    public String generateUrl(){
        return "";
    }

    public boolean download(String url) {
        try {
            if(url != null) {
                return true;
            }

        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return false;
    }


}
