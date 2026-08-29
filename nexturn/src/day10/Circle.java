package day10;

public record Circle(double radius) implements Shape {


//	public double radius() {
//		return radius;
//	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	

	

	
    
}
