package day5;

public final class InterfaceImpl implements One,Two{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl impl=new InterfaceImpl();
		impl.methodOne();
		impl.methodTwo();
		impl.methodThree();
		
	}
	@Override
	public void methodOne() {
	    System.out.println("from interface one methodOne()");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("from interface one methodTwo()");
		
	}
	@Override
	public void methodThree() {
		System.out.println("from interface Two methodThree()");
		
	}

	@Override
	public void methodFour() {
		// TODO Auto-generated method stub
		System.out.println("from interface Three methodFour()");
		
	}

	
	@Override
	public void methodFive() {
		// TODO Auto-generated method stub
		System.out.println("from interface Four methodFive()");
		
	}

	
	

}
