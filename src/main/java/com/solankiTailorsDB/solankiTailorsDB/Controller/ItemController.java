package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping
	public List<ItemModel> getAllItem() {
		return itemservice.getAllItem();
	}
	
	@PutMapping
	public ItemModel updateItem(@RequestBody ItemModel item) {
		return itemservice.updateItem(item);
	}
	
	@DeleteMapping("/{id}")
	public void deletetem(@PathVariable int id) {
		 itemservice.deletetem(id);
	}
	
	@GetMapping("/{id}")
	public ItemModel getItemById(@PathVariable int id) {
		return itemservice.getItemById(id);
	}
	
	@DeleteMapping
	public void deleteAllItem() {
		 itemservice.deleteAllItem();
	}
}
