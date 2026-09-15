package annotationbased;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("ceat")
    private Wheels wheels;
    public void moving() {
        System.out.println("Car is moving");
        wheels.rotate();
    }
}