package day8;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList <String> data= new LinkedList <String> ();
		data.add("nexturn");
		data.add("java");
		data.add(0,"spring");
		System.out.println(data);
		data.addLast("angular");
		data.add("ract");
		System.out.println(data);

	}
}
