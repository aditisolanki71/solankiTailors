package com.solankiTailorsDB.solankiTailorsDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solankiTailorsDB.solankiTailorsDB.Model.ItemModel;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel,Integer>{
	
}
