package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.CategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryservice;
	
	@PostMapping
	public CategoryModel addCategory(@RequestBody CategoryModel category) {
		return categoryservice.addCategory(category);
	}
	
	@GetMapping
	public List<CategoryModel> getAllCategory() {
		return categoryservice.getAllCategory();
	}
}