package jpaex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		Student std = new Student(2010, "priya", 58.73);
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(std);
		tran.commit();
	}
}