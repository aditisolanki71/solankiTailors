package com.solankiTailorsDB.solankiTailorsDB.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "user")
public class UserModel {

	@Id
	@GeneratedValue
	int id;
	String name;
	String username;
	String password;
	String email;
	String address;
	String contactno;
	String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactno;
	}
	public void setContactNo(String contactNo) {
		this.contactno = contactNo;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", contactNo=" + contactno + ", role=" + role
				+ ", getRole()=" + getRole() + ", getId()=" + getId() + ", getName()=" + getName() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getAddress()="
				+ getAddress() + ", getContactNo()=" + getContactNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
