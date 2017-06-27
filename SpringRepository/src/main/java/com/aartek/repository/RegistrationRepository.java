package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.aartek.models.Login;

public class RegistrationRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	public boolean saveRegistration(Login login) {
		   
		return (Boolean) hibernateTemplate.save(login);
		
	}

}
