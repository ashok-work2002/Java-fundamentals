import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, column;
        int[][] mat = new int[100][100];
        int[] array = new int[100];
        System.out.print("Enter number of rows and column in matrix 1:");
        row = s.nextInt();
        column = s.nextInt();

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        int index = 0;
        int size = row * column;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                array[index] = mat[i][j];
                index++;
            }
        }
        int temp;

        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - 1; j++)
            {
               if(array[j+1]<array[j]) {
                temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
               }
            }
        }

        index=0;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                mat[i][j] = array[index];
                index++;
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