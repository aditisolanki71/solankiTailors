package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

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
	public UserModel updateUser(UserModel user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
	}

	@Override
	public UserModel getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<UserModel> g = userrepository.findById(id);
		return g.get();
	}

}
