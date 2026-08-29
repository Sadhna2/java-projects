package Day3;

public class ImmutableSTring {

	public static void main(String[] args) {
		String str1="hyderabad";
		String str2="ABCD";
		String str3="ABDE";
		System.out.println("length: "+str1.length());
		System.out.println("Char at index : "+str1.charAt(4));
		System.out.println("Sub string-1: "+str1.substring(4));
		System.out.println("Sub string-2: "+str1.substring(3,7));
		System.out.println("concat: "+str1.concat(" java"));
		System.out.println(str1);
		System.out.println(str2==str3);
		System.out.println("using compare To: "+(str2.compareTo(str3)));
		System.out.println("using equals: "+(str2.equals(str3)));
		

	}

}
