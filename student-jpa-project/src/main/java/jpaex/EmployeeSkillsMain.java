package jpaex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeSkillsMain {

    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("nexturn26_PU");
        EntityManager manager = emf.createEntityManager();
//        EntityTransaction trans = manager.getTransaction();
//        Employee employee = new Employee();
//        employee.setEmpName("James Gosling");
//        employee.setJob("Java Developer");
//        
//               List<String> skills= List.of("Java", "SQL", "Hibernate");
//               employee.setSkills(skills);
//        trans.begin();
//        manager.persist(employee);
//        trans.commit();
        Employee employee = manager.find(Employee.class, 1);
		System.out.println("Employee ID: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getEmpName());
		System.out.println("Job: " + employee.getJob());
		//System.out.println("Skills: " + employee.getSkills());
		  List<String> skills = employee.getSkills();

          for (String skill : skills) {
              System.out.println(skill);
          }
        manager.close();
        emf.close();
        
    }
}