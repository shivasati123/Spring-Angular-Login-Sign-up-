package com.signuplogin.backend.dbhelpers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.signuplogin.backend.repository.*;
import com.signuplogin.backend.service.UserServices;
import com.signuplogin.backend.models.User;

@Service
public class ExampleDatabase implements UserServices {

	@Autowired
	private UserReposiotry user;

	public User  createUser(User u) {
		System.out.println("hello");
		System.out.print(u);
		User u1 = user.save(u);
		System.out.println(u1);
		return u1;
	}




}