package annotationbased;

import org.springframework.stereotype.Component;

@Component("mrf")
public class Mrf implements Wheels {
    @Override
    public void rotate() {
        System.out.println("Mrf wheels are rotating");
    }
}