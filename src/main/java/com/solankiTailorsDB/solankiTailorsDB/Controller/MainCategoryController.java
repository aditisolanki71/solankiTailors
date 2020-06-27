package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.FileService;
import com.solankiTailorsDB.solankiTailorsDB.Service.MainCategoryService;

@RestController
@RequestMapping("maincategory")
public class MainCategoryController {
	
	@Autowired
	MainCategoryService maincategoryservice;
	
	@Autowired
	FileService fileService;
	
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public MainCategoryModel addMainCategry(@RequestPart("CategoryModel") MainCategoryModel mainCategory,@RequestPart("file") MultipartFile file1) {
		
		Date d = new Date();
		String fileName = file1.getOriginalFilename().split("\\.")[0];
		String extension = file1.getOriginalFilename().split("\\.")[1];
		
		fileName = fileName + "_" + d.getTime() + "." + extension; 
		
		fileService.uploadFile(file1, fileName);
		mainCategory.setImage(fileName);
		
		return maincategoryservice.addMainCategry(mainCategory);
	}
	
	@GetMapping
	public List<MainCategoryModel> getAllMainCategory() {
		return maincategoryservice.getAllMainCategory();
	}
	
	@PutMapping("/{id}")
	public MainCategoryModel updateMainCategory(@PathVariable int id,@RequestBody MainCategoryModel mainCategory) {
		return maincategoryservice.updateMainCategory(id,mainCategory);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMainCategory(@PathVariable int id) {
		maincategoryservice.deleteMainCategory(id);
	}
	
	@GetMapping("/{id}")
	public MainCategoryModel getMainCategoryById(@PathVariable int id) {
		return maincategoryservice.getMainCategoryById(id);
	}
	
	@DeleteMapping
	public void deleteAllMainCategory() {
		maincategoryservice.deleteAllMainCategory();
	}
}
