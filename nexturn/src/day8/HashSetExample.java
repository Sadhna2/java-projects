package day8;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> data =new HashSet<String>();
		data.add("java");
		data.add("react");
		data.add(null);
		data.add("nexturn");
		data.add("java");
		data.add(null);
		System.out.println(data);

	}

}
