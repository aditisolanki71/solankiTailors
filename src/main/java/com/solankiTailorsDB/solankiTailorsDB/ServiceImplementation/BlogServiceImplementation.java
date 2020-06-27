package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;
import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;
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

	@Override
	public BlogModel updateById(int id,BlogModel blog) {
		// TODO Auto-generated method stub
		blog.setId(id);
		Optional<BlogModel> oldBlog = blogRepository.findById(id);
		BlogModel temp = oldBlog.get();
		temp.setDescription(blog.getDescription() == null ? temp.getDescription() : blog.getDescription());
		temp.setComments(blog.getComments() == null ? temp.getComments() : blog.getComments());
		temp.setDate(blog.getDate() == null ? temp.getDate() : blog.getDate());
		temp.setImage(blog.getImage() == null ? temp.getImage() : blog.getImage());
		temp.setLikes(blog.getLikes() == 0 ? temp.getLikes() : blog.getLikes());		
		temp.setName(blog.getName() == null ? temp.getName() : blog.getName());
		return blogRepository.save(temp);
	}

	@Override
	public void deleteBlogById(int id) {
		// TODO Auto-generated method stub
		blogRepository.deleteById(id);
	}

	@Override
	public BlogModel getBlogById(int id) {
		// TODO Auto-generated method stub
		Optional<BlogModel> g =blogRepository.findById(id);
		return g.get();
	}

}
