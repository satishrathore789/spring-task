package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.models.Login;

@Repository
public class LoginRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	public Login findByUserNameAndEmailIdR(Login login) {
		return login=(Login) hibernateTemplate.find("from Login L where L.emailId=? and L.passwords=?",login.getEmailId(),login.getPasswords());

	}

}
