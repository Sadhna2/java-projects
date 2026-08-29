package Day3;

public class CountCharacters {

    public static int countchar(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "Core Java";

        int result = countchar(str);

        System.out.println("Total char: " + result);
    }
}