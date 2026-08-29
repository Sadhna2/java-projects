package day5;

public class ArithematicAppln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithematic arth=(int x,int y)->{
			System.out.println("this is functional interface");
			return x+y;
		};
		int a=arth.add(10, 30);
		System.out.println("a= "+a);
		arth.display();
		Arithematic.sample();

	}

}
