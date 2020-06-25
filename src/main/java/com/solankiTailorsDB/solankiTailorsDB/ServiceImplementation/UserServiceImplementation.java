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
	public UserModel updateUser(int id,UserModel user) {
		// TODO Auto-generated method stub
		user.setId(id);
		Optional<UserModel> oldUser = userrepository.findById(id);
		UserModel temp = oldUser.get();
		temp.setName(user.getName() == null ? temp.getName() : user.getName());
		temp.setAddress(user.getAddress() == null ? temp.getAddress() : user.getAddress());
		temp.setContactNo(user.getContactNo() == null ? temp.getContactNo() : user.getContactNo());
		temp.setEmail(user.getEmail() == null ? temp.getEmail() : user.getEmail());
		temp.setUserName(user.getUserName() == null ? temp.getUserName() : user.getUserName());
		return userrepository.save(temp);
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

	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		userrepository.deleteAll();
	}

}
