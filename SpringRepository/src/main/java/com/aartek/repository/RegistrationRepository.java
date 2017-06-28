package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.models.Login;
@Repository
public class RegistrationRepository {

	@Autowired
private 	HibernateTemplate hibernateTemplate;

	public Integer  saveRegistration(Login login) {

		return  (Integer) hibernateTemplate.save(login);

	}

}
