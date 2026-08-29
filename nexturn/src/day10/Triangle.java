package day10;

public record Triangle(double height,double base) implements Shape {

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

}
