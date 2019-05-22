package com.techdigital.eDigital.Entities;

import javax.persistence.*;

public class hibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("webapp");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		Address newAddress = new Address();
		newAddress.setLine1("Still,");
		newAddress.setLine2("Working");
		newAddress.setCity("Eat");
		newAddress.setState("It");
		newAddress.setZipcode(999);
		entityManager.persist(newAddress);

		entityManager.getTransaction().commit();

		entityManager.close();
		factory.close();
	}
}
