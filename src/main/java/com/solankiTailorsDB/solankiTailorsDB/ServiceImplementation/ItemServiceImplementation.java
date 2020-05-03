package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

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
	@Override
	public List<ItemModel> getAllItem() {
		// TODO Auto-generated method stub
		return itemrepository.findAll();
	}
	@Override
	public ItemModel updateItem(ItemModel item) {
		// TODO Auto-generated method stub
		return itemrepository.save(item);
	}
	@Override
	public void deletetem(int id) {
		// TODO Auto-generated method stub
		itemrepository.deleteById(id);
	}
	@Override
	public ItemModel getItemById(int id) {
		// TODO Auto-generated method stub
		Optional<ItemModel> g = itemrepository.findById(id);
		return g.get();
	}

}
