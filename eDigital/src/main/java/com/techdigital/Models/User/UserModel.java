package com.techdigital.Models.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;

//This class will be used to create a user in the database
public class UserModel {
	
	@Autowired
	private CreateUserTransferObject user;
	
	private boolean check;
	
	public CreateUserTransferObject createUser()
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
	public CreateUserTransferObject authenticate(CreateUserTransferObject userAuth)
	{
		boolean userFlag;
		
		return userAuth;
		
	}

}
