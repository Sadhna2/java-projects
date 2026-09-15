package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bankMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("nexturnspring.xml");

        Customer cust=context.getBean("cust", Customer.class);
        System.out.println("customer Code: " + cust.getCode()+
        		"  customer Name: " + cust.getName()+ 
        		cust.getAccount().getAccountNo()+" "+
        		cust.getAccount().getBalance()
        		);
  
       

	}

}
