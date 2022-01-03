package com.hamdytechy;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password)
	{
		if(user.equals("Hamdy") && password.equals("Techy"))
			return true;
					
		return false;
	}
}
