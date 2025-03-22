package com.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.redis.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/v1/user/details")

	public ResponseEntity<String> getApplications(@RequestParam Long applicationid) {
		
		String applications = userService.getApplications(applicationid);

		return new ResponseEntity<>(applications, HttpStatus.OK);
	}
}
