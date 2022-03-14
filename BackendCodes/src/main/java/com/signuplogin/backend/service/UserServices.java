package com.signuplogin.backend.service;


import org.springframework.stereotype.Component;

import com.signuplogin.backend.models.User;

@Component
public interface UserServices {
	
	public User createUser(User u);

}
