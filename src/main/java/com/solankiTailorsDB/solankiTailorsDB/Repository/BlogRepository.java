package com.solankiTailorsDB.solankiTailorsDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.BlogModel;

@Repository
public interface BlogRepository extends JpaRepository<BlogModel,Integer>{

}
