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

import com.solankiTailorsDB.solankiTailorsDB.Model.TestimonialModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.TestimonialService;

@RestController
@RequestMapping("/testimonial")
public class TestimonialController {
	@Autowired
	TestimonialService testimonialservice;
	
	@PostMapping
	public TestimonialModel addTestimonial(@RequestBody TestimonialModel testimonial) {
		return testimonialservice.addTestimonial(testimonial);
	}
	
	@GetMapping
	public List<TestimonialModel> getAllTestimonial() {
		return testimonialservice.getAllTestimonial();
	}
	
	@PutMapping
	public TestimonialModel updateTestimonial(@RequestBody TestimonialModel testimonial) {
		return testimonialservice.updateTestimonial(testimonial);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable Integer id) {
		 testimonialservice.deleteItem(id);
	}
	
	@GetMapping("/{id}")
	public TestimonialModel getTestimonialById(@PathVariable Integer id) {
		return testimonialservice.getTestimonialById(id);
	}
}
