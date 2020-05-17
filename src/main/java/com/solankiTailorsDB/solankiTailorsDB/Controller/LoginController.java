package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.LoginInput;
import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.LoginService;

@RestController
@RequestMapping
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@PostMapping("login")
	public ResponseEntity login(@RequestBody LoginInput logininput) {
		return loginservice.login(logininput);
	}
	
	@PostMapping("register")
	public ResponseEntity register(@RequestBody UserModel registerinput) {
		return loginservice.register(registerinput);
	}	
}
