package nexturn;

public class CheckForVowelsOrConstants {

	public static void main(String[] args) {
		char x='a';
		switch(x) {
			case 'A','E','I','O','U','a','e','i','o','u'->System.out.println("vowel"); 
			default ->System.out.println("consonant"); 
		};
	}

}
