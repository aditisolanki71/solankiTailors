package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.BlogService;

@RestController
@RequestMapping("blog")
public class BlogController {

	@Autowired
	BlogService blogService;
	
	@PostMapping
	public BlogModel addBlog(@RequestBody BlogModel blog) {
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
}
