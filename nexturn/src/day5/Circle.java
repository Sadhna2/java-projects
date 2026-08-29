package day5;

public class Circle extends Shape {
    
	public Circle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Circle Area="+PI*radius*radius);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle r=new Circle( 68.5);
		r.findArea();

	}

	

}
