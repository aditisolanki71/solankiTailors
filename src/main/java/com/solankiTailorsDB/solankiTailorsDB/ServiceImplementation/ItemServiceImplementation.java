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
	public ItemModel updateItem(int id,ItemModel item) {
		// TODO Auto-generated method stub
		Optional<ItemModel> oldItem = itemrepository.findById(id);
		ItemModel temp = oldItem.get();
		temp.setDescription(item.getDescription() == null ? temp.getDescription() : item.getDescription());
		temp.setImage(item.getImage() == null ? temp.getImage() : item.getImage());
		temp.setLikes(item.getLikes() == 0 ? temp.getLikes() : item.getLikes());
		temp.setName(item.getName() == null ? temp.getName() : item.getName());
		temp.setPrice(item.getPrice() == 0 ? temp.getPrice() : item.getPrice());
		item.setQuantity(item.getQuantity() == 0 ? temp.getQuantity() : item.getQuantity());
		item.setComments(item.getComments() == null ? temp.getComments() : item.getComments());
		return itemrepository.save(temp);
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
	@Override
	public void deleteAllItem() {
		// TODO Auto-generated method stub
		 itemrepository.deleteAll();
	}

}
