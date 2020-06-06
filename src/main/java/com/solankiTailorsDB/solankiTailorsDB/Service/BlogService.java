package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;

public interface BlogService {
	BlogModel addBlog(@RequestBody BlogModel blog);
	List<BlogModel> getBlog();
	BlogModel updateById(BlogModel blog);
}
