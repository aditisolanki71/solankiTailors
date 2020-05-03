package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userservice;
	
	@PostMapping
	public UserModel addUser(@RequestBody UserModel user) {
		return userservice.addUser(user);
	}
	
	@GetMapping
	public List<UserModel> getAllUser() {
		return userservice.getAllUser();
	}
}
