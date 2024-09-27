import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int range = s.nextInt();
        int[] array = new int[100];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < range; i++) {
            array[i]=s.nextInt();
        }
        int max = 0;
        int min=9999;
        for (int i = 0; i < range; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }


        System.out.println("Biggest element of array: "+max);
        System.out.print("Lowest element of array: "+min);
    }
}