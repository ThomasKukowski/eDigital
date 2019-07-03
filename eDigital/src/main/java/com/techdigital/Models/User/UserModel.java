package com.techdigital.Models.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;
import com.hibernate.exception.handling.model.Student;
import com.hibernate.exception.handling.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

//This class will be used to create a user in the database
public class UserModel {
	
	@Autowired
	private CreateUserTransferObject user;
	
	private boolean check;
	
	public CreateUserTransferObject createUser()
	{
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		
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
