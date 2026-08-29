package day6;

public class SampleExecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int y=12;
		int arr[]= {5,6,7,8};
		try {
			int r=x/y;
			System.out.println("result=" +r);
			System.out.println("array value=" +arr[30]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("success");

	}

}
