//package Day3;
//
//public class CountPunctuationMark {
//
//    public static void main(String[] args) {
//
//        String str = "ilqwjoiq;?;lfhwj";
//        String str1 = "sadhnaGupta";
//
//        long punctuation = str.chars()
//                .filter(ch -> ",.?!;".indexOf(ch) >= 0)
//                .count();


//
//        long vowels = str1.chars()
//                .filter(ch -> "AEIOUaeiou".indexOf(ch) >= 0)
//                .count();
//
//        long consonants = str1.chars()
//                .filter(Character::isLetter)
//                .filter(ch -> "AEIOUaeiou".indexOf(ch) < 0)
//                .count();
//
//        System.out.println("Total Punctuation Marks : " + punctuation);
//        System.out.println("Total vowels : " + vowels);
//        System.out.println("Total consonants : " + consonants);
//    }
//}
package Day3;

public class CountPunctuationMArk {
	public static int countPunction(String str) {
	    int count=0;
	    for(int i=0;i<str.length();i++) {
	    	   char ch=str.charAt(i);
	    	   if(ch==',' || ch=='.' || ch=='?' || ch=='!' || ch==';') count++;
	    	   
	    }
	    return count;
 }
	public static int countVowelsAndConsonant(String str) {
		int countVowels=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' 
					|| ch=='e' || ch=='o' || ch=='u') countVowels++;
		}
		return countVowels;
	}
     public static void main(String args[]) {
    	    String str="ilqwjoiq;?;lfhwj";
    	    String str1="sadhnaGupta";
    	   
    	    int vowel=countVowelsAndConsonant(str1);
    	    int n=str1.length();
    	    System.out.println("total Punctuation Marks :"+countPunction(str));
    	    System.out.println("total vowels :" +vowel);
    	    System.out.println("total consonant: "+(n-vowel));
     }
}
