package jpaex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UsingNamedQueries {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		Query query = manager.createNamedQuery("findAllStudents");
		List<Student> students = query.getResultList();

		System.out.println("All Students:");
		students.forEach(student -> System.out.println(student));
		Query queryByRegno = manager.createNamedQuery("findByRegno");
		queryByRegno.setParameter(1, 2000);
		List<Student> filteredStudents = queryByRegno.getResultList();
		System.out.println("\nStudents with RegNo greater than 2000:");
		filteredStudents.forEach(student -> System.out.println(student));
		Query query2 = manager.createNamedQuery("findRegNoAndName");

		List<Object[]> stds = query2.getResultList();

		stds.forEach(std ->
		    System.out.println(std[0] + " " + std[1])
		);
		
		manager.close();
		emf.close();
	}

}
