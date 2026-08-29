package day10;

import java.util.function.Supplier;
class Persons {
    private int code;
    private String name;

    public Persons(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persons [code=" + code + ", name=" + name + "]";
    }
}
public class SupplierExample {

	public static void main(String[] args) {
		int m=10;
		Supplier<Integer>sup=()->{
			return m+5;
		};
		System.out.println("supplier: "+sup.get());
		Supplier<Persons> per=()->{
			return new Persons(101,"arjun");
		};
		System.out.println(per.get());
		
		String str= """
				James Gosling said "Multiple inheritance is removed from java"
				in a meeting
				""";
		System.out.println(str);
		

	}

}
