package nexturn;

public class TwoDimensionArray {

    public static void main(String[] args) {

        int x[][] = new int[3][4];

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                x[i][j] = i + j + 2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}