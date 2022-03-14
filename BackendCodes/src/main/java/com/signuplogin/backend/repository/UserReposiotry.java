package com.signuplogin.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signuplogin.backend.models.User;

@Repository
public interface UserReposiotry
extends CrudRepository<User, Integer> {
	
}
