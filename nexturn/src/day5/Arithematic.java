package day5;

public interface Arithematic {
   int add(int x,int y);
   default void display() {
	   System.out.println("this is defaul method()");
	   
   }
   static void sample() {
	   System.out.println("this is static method()");
   }
}
