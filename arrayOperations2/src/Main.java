import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void readElements(int[] arr, int n){
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("\nElements read successfully");
    }

    public static void displayElements(int[] arr, int n){
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void secondLargest(int[] arr, int n){
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.print("\nLargest element: "+max);
        int secondMax = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }

        System.out.print("\nSecond largest element is: "+secondMax);
    }

    public static void biggestElementOccurrence(int[] arr, int n){
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.print("\nLargest element: "+max);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == max)
                count++;
        }
        System.out.println("\nOccurrence of biggest element: "+count+" times");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        System.out.print("Enter the size of the array: ");
        n=s.nextInt();
        readElements(arr, n);
        displayElements(arr, n);
        secondLargest(arr,n);
        biggestElementOccurrence(arr, n);
    }
}