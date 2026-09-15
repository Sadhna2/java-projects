package sample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("nexturnspring.xml");
		Student student =context.getBean("student", Student.class);
        List <String> list= student.getSubjects();
        System.out.println("Registration No: " + student.getRegno()+
        		"Student Name: " + student.getStdname()+""+list);
       
	}
}
