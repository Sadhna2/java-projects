package Day3;

public class Methods {
	void add(int x,int y) {
		System.out.println("int add= "+(x+y));
	}
	void add(double x,double y) {
		System.out.println("double add= "+(x+y));
	}
	void add(String x,String y) {
		System.out.println("String add= "+(x+y));
	}
	public static void main(String[] args) {
		Methods methods=new Methods();
		methods.add(10.5,2.0);
		methods.add("java ","springboot");

	}
	
	

}
