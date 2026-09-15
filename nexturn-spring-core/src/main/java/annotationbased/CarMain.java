package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
    @SuppressWarnings("resource")
	public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("nexturnspring.xml");
        Car car = context.getBean(Car.class);
        car.moving();
    }
}