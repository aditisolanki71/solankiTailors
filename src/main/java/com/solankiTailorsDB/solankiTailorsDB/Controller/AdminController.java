package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.AdminModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	@PostMapping
	public AdminModel addAdmin(@RequestBody AdminModel admin) {
		return adminservice.addAdmin(admin);
	}
}
