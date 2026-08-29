package Day3;

public class FindDublicates {

    public static void main(String[] args) {

        String str = "programming";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    System.out.println("Duplicate character: " + ch);
                    break;
                }
            }
        }
    }
}