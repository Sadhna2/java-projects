package jpaex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EditStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Student student = manager.find(Student.class, 1003);
		student.setAvg(86.47);
		tran.begin();
		manager.persist(student);
		tran.commit();
		System.out.println("updated");
//		manager.close();
		//for deletion
		student = manager.find(Student.class, 1003);
	    tran.begin();
		manager.remove(student);
		tran.commit();
		System.out.println("deleted");
		manager.close();
	}
}