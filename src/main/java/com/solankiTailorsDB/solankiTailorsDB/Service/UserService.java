package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;

public interface UserService {
	UserModel addUser(UserModel user);
	List<UserModel> getAllUser();
	UserModel updateItem(UserModel user);
}
