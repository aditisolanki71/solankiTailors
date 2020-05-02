package com.solankiTailorsDB.solankiTailorsDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.MainCategoryModel;
@Repository
public interface MainCategoryRepository extends JpaRepository<MainCategoryModel,Integer>{

}
