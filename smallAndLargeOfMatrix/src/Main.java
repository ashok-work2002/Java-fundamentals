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
        int max = 0;
        int min = 9999;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(mat[i][j] < min)
                    min = mat[i][j];
                if(mat[i][j] > max)
                    max = mat[i][j];
            }
        }

        System.out.println("Largest element of the matrix: "+max);
        System.out.print("Smallest element of the matrix: "+min);
    }
}