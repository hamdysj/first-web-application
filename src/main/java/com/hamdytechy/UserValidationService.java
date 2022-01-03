package com.hamdytechy;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password)
	{
		return user.equalsIgnoreCase("Hamdy") 
				&& password.equalsIgnoreCase("techy");
	}
}
