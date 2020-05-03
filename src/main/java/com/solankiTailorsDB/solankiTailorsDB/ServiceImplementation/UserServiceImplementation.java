package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

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

}
