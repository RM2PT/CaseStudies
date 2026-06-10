package com.takeout.takeout_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TakeoutSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeoutSystemApplication.class, args);
	}

}
