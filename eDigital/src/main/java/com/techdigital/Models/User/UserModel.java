package com.techdigital.Models.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//This class will be used to create a user in the database
public class UserModel {

	@Autowired
	private CreateUserTransferObject user;

	private boolean check;

	public CreateUserTransferObject createUser(UserEntity usr) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
		EntityManager entityManager = factory.createEntityManager();
		Session session = null;
		Transaction transaction = null;

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(usr);
			entityManager.getTransaction().commit();
			System.out.println("Transaction Successful");

		} 
		catch (HibernateException e) 
		{
			System.out.println("An error has occured saving your information to our database.");
			throw (e);
		} 
		catch (Exception f) 
		{
			System.out.println("An unexpected error has occured, Please try again later.");
			throw (f);
		} 
		finally 
		{
			entityManager.close();
			factory.close();
		}
		return null;
	}

	public CreateUserTransferObject authenticate(CreateUserTransferObject userAuth) 
	{
		boolean userFlag;

		return userAuth;

	}

}
