package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringExamplePractice {
    public int countStringLength(List<String> strList) {
    	    int count=(int) strList.stream()
    	    		.filter((str)->str.length()>4).count();    	    		
		return count;    	
    }
    public int countEmptyStringLength(List<String> strList) {
	    int count=(int) strList.stream()
	    		.filter((str)->str.isEmpty()).count();    	    		
	    return count;    	
    }
    public List<String> RemoveEmptyString(List<String> strList) {
	    List<String> result= strList.stream()
	    		.filter((str)->!str.isEmpty())
	    		.collect(Collectors.toList());
	    return result;    	
    }
    public List<String> SquareDistinct(List<String> strList) {
	    List<String> result= strList.stream()
	    		.filter((str)->!str.isEmpty())
	    		.collect(Collectors.toList());
	    return result;    	
    }
    public List<String> ExtractStringLength4(List<String> strList) {
	    List<String> result= strList.stream()
	    		.filter((str)->str.length()>4)
	    		.collect(Collectors.toList());
	    return result;    	
    }
    public String StringToUpperCase(List<String> strList) {
	    String result= strList.stream()
	    		.map((str)->str.toUpperCase())
	    		.collect(Collectors.joining(","));
	    return result;    	
    }
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("nexturn");
		strList.add("next");
		strList.add("nicmar");
		strList.add("java");
		strList.add("set");
		strList.add("");
		StringExamplePractice s=new StringExamplePractice();
		System.out.println(s.countStringLength(strList));
		System.out.println(s.countEmptyStringLength(strList));
		System.out.println(s.RemoveEmptyString(strList));
		System.out.println(s.ExtractStringLength4(strList));
		System.out.println(s.StringToUpperCase(strList));
		

	}

}
