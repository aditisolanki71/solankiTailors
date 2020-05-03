package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.UserRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public UserModel addUser(UserModel user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	@Override
	public List<UserModel> getAllUser() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public UserModel updateItem(UserModel user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	@Override
	public void deleteItem(int id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
	}

}
