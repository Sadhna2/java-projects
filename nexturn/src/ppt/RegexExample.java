package ppt;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexExample {
    public static void main(String args[]) {
    	Pattern p=Pattern.compile(".s");
    	Matcher m=p.matcher("aas");
    	boolean b=m.matches();
    	System.out.println(b);
    	boolean b1=Pattern.matches(".d", "ed");
    	System.out.println(b1);
    	
    	
    }
}
