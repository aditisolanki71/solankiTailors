package com.solankiTailorsDB.solankiTailorsDB.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CategoryModel {
	@Id
	@GeneratedValue
	int id;
	String name;
	String description;
	String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "CategoryController [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDescription()=" + getDescription()
				+ ", getImage()=" + getImage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}