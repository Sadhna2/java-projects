 package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> phoneBook=new HashMap<String,Integer>();
		phoneBook.put("nexturn", 12345678);
		phoneBook.put("james", 12879231);
		phoneBook.put("charles",927446512);
		phoneBook.put("nicmar", 92190248);
		phoneBook.put("nexturn", 872349032);
		System.out.println(phoneBook);
		Set<Entry<String,Integer>> set=phoneBook.entrySet();
		Iterator<Entry<String,Integer>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}

	}

}
