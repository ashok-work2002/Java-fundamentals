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
        int temp;
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                for (int h = 0; h < column-k-1; h++) {
                    if (mat[i][h + 1] < mat[i][h]) {
                        temp = mat[i][h];
                        mat[i][h] = mat[i][h + 1];
                        mat[i][h+1] = temp;
                    }
                }
            }
        }

        System.out.println("Matrix after sorting:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}