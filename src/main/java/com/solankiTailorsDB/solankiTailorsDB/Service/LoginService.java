package com.solankiTailorsDB.solankiTailorsDB.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.LoginInput;


public interface LoginService {
	ResponseEntity login(LoginInput login);
}
