package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<TestimonialModel> getAllTestimonial() {
		// TODO Auto-generated method stub
		return testimonialrepository.findAll();
	}

	@Override
	public TestimonialModel updateTestimonial(TestimonialModel testimonial) {
		// TODO Auto-generated method stub
		return testimonialrepository.save(testimonial);
	}

	@Override
	public void deleteItem(Integer id) {
		// TODO Auto-generated method stub
		testimonialrepository.deleteById(id);
	}

	@Override
	public TestimonialModel getTestimonialById(Integer id) {
		// TODO Auto-generated method stub
	Optional<TestimonialModel> g= testimonialrepository.findById(id);
	return g.get();
	}

}
