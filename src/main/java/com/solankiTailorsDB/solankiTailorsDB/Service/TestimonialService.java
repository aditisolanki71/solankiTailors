package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.TestimonialModel;

public interface TestimonialService {
	TestimonialModel addTestimonial(TestimonialModel testimonial);
	List<TestimonialModel> getAllTestimonial();
	TestimonialModel updateTestimonial(TestimonialModel testimonial);
	void deleteItem(Integer id);
}
