package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.BlogRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.BlogService;

@Service
public class BlogServiceImplementation implements BlogService{

	@Autowired
	BlogRepository blogRepository;
	
	@Override
	public BlogModel addBlog(BlogModel blog) {
		// TODO Auto-generated method stub
		return blogRepository.save(blog);
	}

	@Override
	public List<BlogModel> getBlog() {
		// TODO Auto-generated method stub
		return blogRepository.findAll();
	}

}
