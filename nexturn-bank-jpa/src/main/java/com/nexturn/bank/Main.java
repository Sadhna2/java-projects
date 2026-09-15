package com.nexturn.bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager=emf.createEntityManager();
		EntityTransaction trans= manager.getTransaction();
	}

}
