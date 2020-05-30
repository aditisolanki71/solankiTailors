package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import com.solankiTailorsDB.solankiTailorsDB.Model.TestimonialModel;

public interface TestimonialService {
	TestimonialModel addTestimonial(TestimonialModel testimonial);
	List<TestimonialModel> getAllTestimonial();
}
