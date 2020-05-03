package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.ItemModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.ItemRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.ItemService;
@Service
public class ItemServiceImplementation implements ItemService{

	@Autowired
	ItemRepository itemrepository;
	@Override
	public ItemModel additem(ItemModel item) {
		// TODO Auto-generated method stub
		return itemrepository.save(item);
	}

}
