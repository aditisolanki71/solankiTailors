package com.solankiTailorsDB.solankiTailorsDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.CategoryModel;
@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel,Integer> {

}
