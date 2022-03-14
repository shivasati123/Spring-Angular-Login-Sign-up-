package com.signuplogin.backend.models;

public class AuthUserResponse {
    
	private String token;
	private String name;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AuthUserResponse(String token, String name) {
		super();
		this.token = token;
		this.name = name;
	}
	public AuthUserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
