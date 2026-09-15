package jpaex;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("from Student");
		List<Student> stdlist = qry.getResultList();
		stdlist.forEach((std) ->
		    System.out.println(std));
	}
}