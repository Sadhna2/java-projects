package sample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("nexturnspring.xml");
		HelloSpring hs =context.getBean("hello",HelloSpring.class);
		HelloSpring hs2 =context.getBean("hello",HelloSpring.class);
		hs2.setCode(1223);
		System.out.println(hs.getCode()+" "+hs.getName());
		System.out.println(hs2.getCode()+" "+hs2.getName());
		

	}

}
