package com.solankiTailorsDB.solankiTailorsDB.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table ( name = "main_category")
public class MainCategoryModel {
	
	@Id
	@GeneratedValue
	
	int Id;
	String name;
	String image;
	
	@OneToMany(mappedBy = "mainCategory")
	List<CategoryModel> categories;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
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
		return "MainCategoryModel [Id=" + Id + ", name=" + name + ", image=" + image + ", getImage()=" + getImage()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
