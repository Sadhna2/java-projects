package day5;

public abstract class Shape {
   protected double length;
   protected double breadth;
   protected double radius;
   public static final double PI=3.14;
   public Shape(double length, double breadth) {
	
	this.length = length;
	this.breadth = breadth;
	
   }
   public Shape(double radius) {
	
	this.radius = radius;
}
   public abstract void findArea();
   
   
}
