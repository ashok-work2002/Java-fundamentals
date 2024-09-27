import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, column;
        int[][] mat1 = new int[100][100];
        int[][] mat2 = new int[100][100];
        int[][] sum = new int[100][100];
        int row2, column2;
        System.out.print("Enter number of rows and column in matrix 1:");
        row = s.nextInt();
        column = s.nextInt();

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter number of rows and column in matrix 2:");
        row2 = s.nextInt();
        column2 = s.nextInt();

        if (row != row2 || column != column2) {
            System.out.print("Cannot add the matrices!");
            exit(0);
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                mat2[i][j] = s.nextInt();
            }
        }

        System.out.println("Sum of matrices: ");

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}