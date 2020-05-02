package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping
	public CategoryModel updateCategory(@RequestBody CategoryModel category) {
		return categoryservice.updateCategory(category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable int id) {
		categoryservice.deleteCategory(id);
	}
	
	@GetMapping("/{id}")
	public CategoryModel getCategoryById(@PathVariable int id) {
		return categoryservice.getCategoryById(id);
	}
	
	@DeleteMapping
	public void deleteAllCategory() {
		categoryservice.deleteAllCategory();
	}
}
