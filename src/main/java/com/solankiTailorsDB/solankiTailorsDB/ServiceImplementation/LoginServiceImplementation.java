package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.LoginInput;
import com.solankiTailorsDB.solankiTailorsDB.Model.UserModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.UserRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.LoginService;

@Service
public class LoginServiceImplementation implements LoginService {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public ResponseEntity login(LoginInput login) {
		// TODO Auto-generated method stub
		String username = login.getUsername();
		String password = login.getPassword();
		UserModel user = userrepository.findByUsername(username);
		if(user == null) {
			return new ResponseEntity<>("Username not found",HttpStatus.BAD_REQUEST);
		}
		if(password.equals(user.getPassword())) {
			return new ResponseEntity<>("Login Success",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Login Fail",HttpStatus.UNAUTHORIZED);
		}
	}

}
