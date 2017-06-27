package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aartek.models.Login;

@Repository
public class LoginRepository {

	@Autowired
	public Login findByUserNameAndEmailIdR(Login login) {
		return login;
		// TODO Auto-generated method stub

	}

}
