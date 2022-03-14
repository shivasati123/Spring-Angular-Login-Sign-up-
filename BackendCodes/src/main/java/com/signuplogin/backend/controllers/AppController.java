package com.signuplogin.backend.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signuplogin.backend.models.User;
import com.signuplogin.backend.service.UserServices;


@RestController
public class AppController {
	
	@Autowired
    private UserServices us;
	
	@PostMapping("/signup")
	public ResponseEntity<User> handleSignUp(@RequestBody User u) {
		User u1 = us.createUser(u);       
	  return ResponseEntity.ok().contentType(MediaType.APPLICATION_PROBLEM_JSON).body(u1);
		}
}
