package day14;

public class Calculator {
    public int add(int x,int y) {
    	   return x+y;
    }
    public int multiply (int x,int y) {
    	    return x*y;
    }
    public int division (int x,int y) {
    	int r=0;
    try {
    	   r=x/y;
    }
    catch (ArithmeticException e) {
    	    throw new ArithmeticException("division cannot be done");
    }
		return r;
    	   
    }
}
