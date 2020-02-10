package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.RegisterUserRequest;
import com.example.demo.model.RegisterUserResponse;
import com.example.demo.service.RegisterUserService;

@RestController
public class UserController {

	@Autowired
	private RegisterUserService service;
	
	
	@RequestMapping(path = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public RegisterUserResponse registerUser(@RequestBody RegisterUserRequest req) {

		RegisterUserResponse res = new RegisterUserResponse();
		res = service.registerUser(req);
		return res;

	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public LoginResponse userLogin(LoginRequest req ) {
		
		LoginResponse res = new LoginResponse();
		res = service.userLogin(req);
		return res;
		
		
	}

}
