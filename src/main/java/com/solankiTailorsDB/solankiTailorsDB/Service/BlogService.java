package com.solankiTailorsDB.solankiTailorsDB.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;

public interface BlogService {
	BlogModel addBlog(@RequestBody BlogModel blog);
}
