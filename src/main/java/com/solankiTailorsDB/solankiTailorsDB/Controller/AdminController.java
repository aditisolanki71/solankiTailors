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
	
	@GetMapping
	public List<AdminModel> getAllAdmin() {
		return adminservice.getAllAdmin();
	}
	
	@PutMapping()
	public AdminModel updateAdmin(@RequestBody AdminModel admin) {
		return adminservice.updateAdmin(admin);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAdmin(@PathVariable int id) {
		adminservice.deleteAdmin(id);
	}

	@GetMapping("/{id}")
	public AdminModel getAdminById(@PathVariable int id) {
		return adminservice.getAdminById(id);
	}
	
	@DeleteMapping
	public void deleteAllAdmin() {
		adminservice.deleteAllAdmin();
	}
}
