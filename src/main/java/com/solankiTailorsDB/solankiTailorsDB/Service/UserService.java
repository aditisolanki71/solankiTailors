package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;

public interface UserService {
	UserModel addUser(UserModel user);
	List<UserModel> getAllUser();
	UserModel updateUser(UserModel user);
	void deleteUser(int id);
	UserModel getUserById(int id);
	void deleteAllUser();
}
