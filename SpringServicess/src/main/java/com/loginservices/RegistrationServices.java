package com.loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.models.Login;
import com.aartek.repository.RegistrationRepository;
@Service
public class RegistrationServices {

@Autowired
private RegistrationRepository loginRepository;
	
	public Integer saveRegistrationform(Login login) {
		   return loginRepository.saveRegistration(login);
	}
	
	
	

}
