package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/{id}")
	public UserModel updateUser(@PathVariable int id,@RequestBody UserModel user) {
		return userservice.updateUser(id,user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		 userservice.deleteUser(id);
	}
	
	@GetMapping("/{id}")
	public UserModel getUserById(@PathVariable int id) {
		return userservice.getUserById(id);
	}
	 
	@DeleteMapping
	public void deleteAllUser() {
		userservice.deleteAllUser();
	}
}
