package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;

public interface MainCategoryService {
	MainCategoryModel addMainCategry(MainCategoryModel mainCategory);
	List<MainCategoryModel> getAllMainCategory();
	MainCategoryModel updateMainCategory(MainCategoryModel mainCategory);
	void deleteMainCategory(int id);
	MainCategoryModel getMainCategoryById(int id);
}
