package day10;

public class SwitchPatternMatching {

	public static void main(String[] args) {
			
		
		Shape obj = new Circle(4);
        double area = switch (obj) {
            case Circle c -> c.radius()*c.radius();
            case Rectangle r -> r.area();
            case Triangle t -> t.area();
            default -> throw new IllegalStateException();
        };
        System.out.println(area);
	}

}
