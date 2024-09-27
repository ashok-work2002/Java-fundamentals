import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.print("Enter the number of elements in the array: ");
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        System.out.println("Enter the array: ");
        for (int i = 0; i < range; i++) {
            array[i]=s.nextInt();
        }

        //sorting

        for (int i = 0; i < range - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < range; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.print("Enter the element you want to search: ");
        int find = s.nextInt();
        int low = 0;
        int high = range -1;
        int mid = (low + high) /2;


        while(array[mid]!= find) {
            mid = (low+high)/2;
            if(find < array[mid])
                high = mid -1;
            if(find > array[mid])
                low = mid+1;
        }
        if(array[mid]==find)
            System.out.println("Element "+array[mid]+" found");
        else
            System.out.println("Element not found!");
    }
}