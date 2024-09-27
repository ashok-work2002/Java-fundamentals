import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, column;
        int[][] mat = new int[100][100];
        System.out.print("Enter number of rows and column in matrix 1:");
        row = s.nextInt();
        column = s.nextInt();

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = s.nextInt();
            }
        }

        System.out.println("Transpose of the given matrix: ");

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}