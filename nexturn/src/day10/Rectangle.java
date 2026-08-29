package day10;

public record Rectangle(double length,double breadth) implements Shape {

	public double length() {
		return length;
	}

	public double breadth() {
		return breadth;
	}

	@Override
	public double area() {
		
		return length*breadth;
	}

}
