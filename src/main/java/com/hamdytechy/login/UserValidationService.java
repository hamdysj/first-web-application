package com.hamdytechy.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean isUserValid(String user, String password)
	{
		return user.equalsIgnoreCase("Hamdy") 
				&& password.equalsIgnoreCase("techy");
	}
}
