package Day3;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hydrabad");
		System.out.println(sb);
		sb.append(" java");
		System.out.println(sb);
		sb.delete(4,7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String str=sb.toString();
		System.out.println(str);

	}

}
