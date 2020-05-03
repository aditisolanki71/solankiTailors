package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import com.solankiTailorsDB.solankiTailorsDB.Model.ItemModel;

public interface ItemService {
	ItemModel additem(ItemModel item);
	List<ItemModel> getAllItem();
}
