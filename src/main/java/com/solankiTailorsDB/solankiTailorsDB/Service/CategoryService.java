package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import com.solankiTailorsDB.solankiTailorsDB.Model.CategoryModel;

public interface CategoryService {
	CategoryModel addCategory(CategoryModel category);
	List<CategoryModel> getAllCategory();
	CategoryModel updateCategory(int id,CategoryModel category);
	void deleteCategory(int id);
	CategoryModel getCategoryById(int id);
	void deleteAllCategory();
}
