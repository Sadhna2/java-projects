package annotationbased;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AccountMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("nexturnspring.xml");
		Account acnt = context.getBean("acnt",Account.class);
		System.out.println(acnt.getAccNo()+" "+
		             acnt.getCustName()+" "+acnt.getBalance());
		System.out.println(acnt.getTransaction().getTranId());
	}
}