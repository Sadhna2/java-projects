package com.nexturn.bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtilities {
	private static EntityManager manager;

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn26_PU");
		manager = factory.createEntityManager();
		return manager;
	}
}
