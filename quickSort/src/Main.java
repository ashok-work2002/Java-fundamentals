import java.util.Scanner;

public class Main {
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void swap(int[]arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
    public static int partition(int[] arr, int low, int high){
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j] < arr[high]){
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i+1,high);
        return i+1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        quickSort(arr, 0, n-1);

        System.out.println("The array after quick sort is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}