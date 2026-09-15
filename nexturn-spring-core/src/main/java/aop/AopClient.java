package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontainer.xml");
		Operation oper = context.getBean("opr", Operation.class);
		oper.msg();
		oper.m();
		oper.k();

	}

}
