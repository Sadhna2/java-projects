package day5;

public class Rectangle extends Shape {
    
	public Rectangle(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area="+length*breadth);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle r = new Rectangle(65, 78);
		 r.findArea();

	}

	

}
