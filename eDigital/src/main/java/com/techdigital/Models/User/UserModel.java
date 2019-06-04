package com.techdigital.Models.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.User;

//This class will be used to create a user in the database
public class UserModel {
	
	@Autowired
	private User user;
	
	private boolean check;
	
	public User createUser()
	{
		
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
		}
		return null;
	}
	public User authenticate(User userAuth)
	{
		boolean userFlag;
		
		return userAuth;
		
	}

}
