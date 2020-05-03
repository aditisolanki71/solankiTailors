package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.ItemModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	ItemService itemservice;
	
	@PostMapping
	public ItemModel additem(@RequestBody ItemModel item) {
		return itemservice.additem(item);
	}
}
