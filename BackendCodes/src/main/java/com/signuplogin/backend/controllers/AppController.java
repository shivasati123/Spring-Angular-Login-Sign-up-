package com.signuplogin.backend.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signuplogin.backend.models.AuthUserResponse;
import com.signuplogin.backend.models.User;
import com.signuplogin.backend.service.UserServices;
import com.signuplogin.backend.utils.GenerateJWT;


@RestController
public class AppController {
	
	@Autowired
    private UserServices us;
	
	@Autowired
	GenerateJWT jwt;
	
	@PostMapping("/signup")
	public ResponseEntity<AuthUserResponse> handleSignUp(@RequestBody User u) {
	   String token = jwt.generateJWT(u.name);
	    us.createUser(u);
	   AuthUserResponse au = new AuthUserResponse();
	   au.setName(u.name);
	   au.setToken(token);
	  return ResponseEntity.ok().contentType(MediaType.APPLICATION_PROBLEM_JSON).body(au);
		}
}
