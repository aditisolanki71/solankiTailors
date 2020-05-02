package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.CategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.CategoryRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService{

	@Autowired
	CategoryRepository categoryrepository;
	@Override
	public CategoryModel addCategory(CategoryModel category) {
		// TODO Auto-generated method stub
		return categoryrepository.save(category);
	}
	@Override
	public List<CategoryModel> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryrepository.findAll();
	}

}
