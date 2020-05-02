package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.MainCategoryRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.MainCategoryService;

@Service
public class MainCategoryServiceImplementation implements MainCategoryService{

	@Autowired
	MainCategoryRepository maincategoryrepository;
	
	@Override
	public MainCategoryModel addMainCategry(MainCategoryModel mainCategory) {
		// TODO Auto-generated method stub
		return maincategoryrepository.save(mainCategory);
	}

	@Override
	public List<MainCategoryModel> getAllMainCategory() {
		// TODO Auto-generated method stub
		return maincategoryrepository.findAll();
	}

	@Override
	public MainCategoryModel updateMainCategory(MainCategoryModel mainCategory) {
		// TODO Auto-generated method stub
		return maincategoryrepository.save(mainCategory);
	}
	

}
