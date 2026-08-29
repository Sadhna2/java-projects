package day10;

import day5.One;

public record SampleRecord(int code ,String name, double amount) implements One {

	public int code() {
		return code;
	}

	public String name() {
		return name;
	}

	public double amount() {
		return amount;
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("this is from sealed inteface of methodOne");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("this is from Sealed interface of methodTwo");
		
	}
	
	
}
