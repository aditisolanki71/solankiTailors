package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.solankiTailorsDB.solankiTailorsDB.Model.ItemModel;

public interface ItemService {
	ItemModel additem(ItemModel item);
	List<ItemModel> getAllItem();
	ItemModel updateItem(int id,ItemModel item);
	void deletetem(@PathVariable int id);
	ItemModel getItemById(int id);
	void deleteAllItem();
}
