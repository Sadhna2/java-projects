package day8;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("nexturn");
		list.add(500);
		list.add(59.67);
		list.add('a');
		list.add(null);
		list.add(null);
		list.add("nexturn");
		System.out.println(list+"size="+list.size());
		list.add(5);
		list.add(52);
		list.add(1,45);
		System.out.println(list+"size="+list.size()); 
		list.remove("nexturn");
		list.remove(Integer.valueOf(500));
		System.out.println(list+"size="+list.size());
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
		    Object obj = itr.next();

		    if (obj instanceof Integer) {
		        System.out.println(obj);
		    }
		}
		
		list.remove(null);
		list.remove(59.67);
		System.out.println(list+"size="+list.size());		
	}

}
