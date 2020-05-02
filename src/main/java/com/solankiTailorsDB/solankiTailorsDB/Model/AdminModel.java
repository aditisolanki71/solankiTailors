package com.solankiTailorsDB.solankiTailorsDB.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//file-1
@Entity
public class AdminModel {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String contact;
	String password;
	String userName;
	
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "AdminModel [id=" + id + ", name=" + name + ", contact=" + contact + ", password=" + password
				+ ", userName=" + userName + "]";
	}
}
