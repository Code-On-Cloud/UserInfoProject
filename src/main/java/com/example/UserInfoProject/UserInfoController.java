package com.example.UserInfoProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	private static Logger log = LoggerFactory.getLogger(UserInfoController.class);
	
	@GetMapping(value = "/userinfo")
	public String getUserInfo() {
		log.info("Fetching User Info...");
		return "new delhi";
	}
}
