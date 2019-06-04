package com.techdigital.eDigital.Entities;

import javax.persistence.*;

public class hibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("webapp");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		AddressEntity newAddress = new AddressEntity();
		newAddress.setLine1("Something,");
		newAddress.setLine2("Somewhere");
		newAddress.setCity("Some Place");
		newAddress.setState("Some Time");
		newAddress.setZipcode(666);
		entityManager.persist(newAddress);

		entityManager.getTransaction().commit();

		entityManager.close();
		factory.close();
	}
}
