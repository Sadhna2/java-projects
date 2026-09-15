package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

    	AbstractApplicationContext context =new ClassPathXmlApplicationContext("nexturnspring.xml");

        Employee employee =context.getBean("empl", Employee.class);
  
        System.out.println("Employee Code: " + employee.getCode()+
        		"  Employee Name: " + employee.getName()+
        		"  Employee Salary: " + employee.getSalary()+" "+employee.getAddress().getCity()+
        		" " +employee.getAddress().getStreet()
        		);
         context.close();
        
    }
}