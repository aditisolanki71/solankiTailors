package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.TestimonialModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.TestimonialRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.TestimonialService;

@Service
public class TestimonialServiceImplementation implements TestimonialService {

	@Autowired
	TestimonialRepository testimonialrepository;
	
	@Override
	public TestimonialModel addTestimonial(TestimonialModel testimonial) {
		// TODO Auto-generated method stub
		return testimonialrepository.save(testimonial);
	}

}
