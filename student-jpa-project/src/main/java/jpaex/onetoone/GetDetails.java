package jpaex.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDetails {
    public static void main(String args[]) {
    	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager=emf.createEntityManager();
		Person person=manager.find(Person.class,1);
		System.out.println(person);
		Passport passport=manager.find(Passport.class, "B1276t3");
		System.out.println(passport);
		person=manager.find(Person.class, passport.getPerson().getAddress());
		System.out.println(person);
    }
}
