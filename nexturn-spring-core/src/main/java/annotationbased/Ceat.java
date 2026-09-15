package annotationbased;

import org.springframework.stereotype.Component;

@Component("ceat")
public class Ceat implements Wheels {
    @Override
    public void rotate() {
        System.out.println("CEAT wheels are rotating");
    }
}