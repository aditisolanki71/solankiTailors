package com.solankiTailorsDB.solankiTailorsDB.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table ( name = "main_category")
public class MainCategoryModel {
	
	@Id
	@GeneratedValue
	int Id;
	String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MainCategoryModel [Id=" + Id + ", name=" + name + "]";
	}
	
}
