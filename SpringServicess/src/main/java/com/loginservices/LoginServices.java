package com.loginservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.models.Login;
import com.aartek.repository.LoginRepository;
@Service
public class LoginServices {
 
  @Autowired
  private LoginRepository loginRepository;
	
	public List findByUserNameAndEmailId(Login login) {
		// TODO Auto-generated method stub
		return loginRepository.findByUserNameAndEmailIdR(login);
	}

}
