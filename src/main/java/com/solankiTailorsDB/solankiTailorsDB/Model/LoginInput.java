package com.solankiTailorsDB.solankiTailorsDB.Model;

public class LoginInput {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginInput [username=" + username + ", password=" + password + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
