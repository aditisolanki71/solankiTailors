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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;
import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.BlogService;
import com.solankiTailorsDB.solankiTailorsDB.Service.FileService;

@RestController
@RequestMapping("blog")
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@Autowired
	FileService fileService;
	
//	@PostMapping
//	public BlogModel addBlog(@RequestBody BlogModel blog) {
//		return blogService.addBlog(blog);
//	}
	
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public BlogModel addBlog(@RequestPart("BlogModel") BlogModel blog,@RequestPart("file") MultipartFile file1)  {
		Date d = new Date();
		String fileName = file1.getOriginalFilename().split("\\.")[0];
		String extension = file1.getOriginalFilename().split("\\.")[1];
		
		fileName = fileName + "_" + d.getTime() + "." + extension; 
		
		fileService.uploadFile(file1, fileName);
		blog.setImage(fileName);
		
		return blogService.addBlog(blog);
	}
	
	@GetMapping
	public List<BlogModel> getBlog() {
		return blogService.getBlog();
	}
	
	@PutMapping
	public BlogModel updateById(@RequestBody BlogModel blog) {
		return blogService.updateById(blog);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBlogById(@PathVariable int id) {
		blogService.deleteBlogById(id);
	}
	
	@GetMapping("/{id}")
	public BlogModel getBlogById(@PathVariable int id) {
		return blogService.getBlogById(id);
	}
}
