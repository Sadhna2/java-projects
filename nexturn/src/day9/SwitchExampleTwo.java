package day9;

public class SwitchExampleTwo {
    public static String getTypeDescription(Object obj) {
    	    return switch(obj) {
    	    case String s->"A string with length " +s.length(); 
    	    case Integer i->"An integer with value " +i; 
    	    case Double d->"A Double with value " +d; 
    	    case null->"A null object";
    	    default-> "an unknown type";
    	    };
    }
	public static void main(String[] args) {
		Object obj1="Hello world";
		Object obj2=42;
		Object obj3=789.32;
		Object obj4=null;
		System.out.println(getTypeDescription(obj1));
		System.out.println(getTypeDescription(obj2));
		System.out.println(getTypeDescription(obj3));
		System.out.println(getTypeDescription(obj4));
	}

}
