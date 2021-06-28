package com.example.UserInfoProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserInfoProjectApplication {

	private static Logger log = LoggerFactory.getLogger(UserInfoProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(UserInfoProjectApplication.class, args);
		log.info("Inside UserInfoProject");
	}

}
