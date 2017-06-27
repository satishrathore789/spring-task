package com.loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.models.Login;
import com.aartek.repository.LoginRepository;
@Service
public class LoginServices {
 
  @Autowired
  LoginRepository loginRepository;
	
	public Login findByUserNameAndEmailId(Login login) {
		// TODO Auto-generated method stub
		return loginRepository.findByUserNameAndEmailIdR(login);
	}

}
