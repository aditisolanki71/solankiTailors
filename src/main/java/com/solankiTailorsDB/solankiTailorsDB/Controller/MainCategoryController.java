package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.MainCategoryService;

@RestController
@RequestMapping("maincategory")
public class MainCategoryController {
	
	@Autowired
	MainCategoryService maincategoryservice;
	
	@PostMapping
	public MainCategoryModel addMainCategry(@RequestBody MainCategoryModel mainCategory) {
		return maincategoryservice.addMainCategry(mainCategory);
	}
}