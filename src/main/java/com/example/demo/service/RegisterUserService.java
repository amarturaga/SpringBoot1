package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.model.LoginRequest;
import com.example.demo.model.LoginResponse;
import com.example.demo.model.RegisterUserRequest;
import com.example.demo.model.RegisterUserResponse;
import com.example.demo.repo.UserRepo;

@Service
public class RegisterUserService {

	@Autowired
	private UserRepo userRepo;

	public RegisterUserResponse registerUser(RegisterUserRequest req) {

		RegisterUserResponse res = new RegisterUserResponse();
		User user = new User();
		user.setUserId(req.getUserId());
		user.setFistName(req.getFistName());
		user.setLastName(req.getLastName());
		user.setAddress(req.getAddress());
		user.setPassword(req.getPassword());
		userRepo.save(user);
		res.setResult("User Regisetred Successfully");

		return res;

	}

	public LoginResponse userLogin(LoginRequest req) {

		LoginResponse res = new LoginResponse();
		User user = new User();
		user = userRepo.findByUserIdAndPassword(req.getUserId(), req.getPassword());

		if (user != null) {
			res.setResult("User successfully LoggedIn");
		}else {
			res.setResult("Please Enter Valid UserId and Password");
			}

		return res;
	}

}
