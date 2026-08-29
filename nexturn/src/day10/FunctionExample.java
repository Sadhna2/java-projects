package day10;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String,Integer> fun1=(str)->Integer.valueOf(str);
		int val=fun1.apply("150");
		System.out.println(++val);
		
		Function<Integer,Double> fun2=(v)->Math.sqrt(v);
		System.out.println(fun2.apply(11));
		

	}

}
