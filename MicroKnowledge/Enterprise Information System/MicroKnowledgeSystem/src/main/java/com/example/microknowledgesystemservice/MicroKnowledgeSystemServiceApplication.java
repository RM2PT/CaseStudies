package com.example.microknowledgesystemservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class MicroKnowledgeSystemServiceApplication {

    private static final Logger LOGGER = LogManager.getLogger(MicroKnowledgeSystemServiceApplication.class);

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
        SpringApplication.run(MicroKnowledgeSystemServiceApplication.class, args);
        System.out.println("Service has started");
    }

}
