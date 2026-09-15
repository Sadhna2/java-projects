package jpaex.onetoone;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager=emf.createEntityManager();
		EntityTransaction trans= manager.getTransaction();
//		Person person=new Person();
//        person.setPersonId(2);
//		person.setAddress("hyderabad");
//		person.setPersonName("james Goslin");
//		
//		Passport passport=new Passport();
//		passport.setPassportNumber("c1276t3");
//		passport.setDateIssued(LocalDate.now());
//		passport.setDateExpiry(LocalDate.now().plusYears(10));
//		passport.setPerson(person); 
		Person person = manager.find(Person.class, 2);
		Passport passport = new Passport();
		passport.setPassportNumber("C1276t3");
		passport.setDateIssued(LocalDate.now());
		passport.setDateExpiry(LocalDate.now().plusYears(10));

		passport.setPerson(person);

		trans.begin();
		manager.persist(passport);
		trans.commit();

		System.out.println("New passport added successfully!");

//		trans.begin();
//		manager.persist(passport);
//		trans.commit();
	manager.close();

	}

}
