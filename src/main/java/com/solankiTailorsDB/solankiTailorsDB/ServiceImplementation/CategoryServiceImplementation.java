package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

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
	@Override
	public CategoryModel updateCategory(int id,CategoryModel category) {
		// TODO Auto-generated method stub
		Optional<CategoryModel> oldCategory = categoryrepository.findById(id);
		CategoryModel temp = oldCategory.get();
		temp.setDescription(category.getDescription() == null ? temp.getDescription() : category.getDescription());
		temp.setImage(category.getImage() == null ? temp.getImage() : category.getImage());
		temp.setItems(category.getItems() == null ? temp.getItems() : category.getItems());
		temp.setMainCategory(category.getMainCategory() == null ? temp.getMainCategory() : category.getMainCategory());
		temp.setName(category.getName() == null ? temp.getName() : category.getName());
		return categoryrepository.save(temp);
	}
	@Override
	public void deleteCategory(int id) {
		categoryrepository.deleteById(id);
	}
	@Override
	public CategoryModel getCategoryById(int id) {
		// TODO Auto-generated method stub
		Optional<CategoryModel> g = categoryrepository.findById(id);
		return g.get();
	}
	@Override
	public void deleteAllCategory() {
		// TODO Auto-generated method stub
		categoryrepository.deleteAll();
	}
}
