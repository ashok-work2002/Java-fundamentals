import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int[] arr = new int[100];
        System.out.print("Enter the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int max = 0;
        // find max
        for (int i = 0; i < size; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] countArray = new int[100];
        int count = 0;
        for (int i = 0; i < max+1; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if(arr[j]==i)
                    count++;
            }
            countArray[i] = count;
        }

        for (int i = 1; i < max+1; i++) {
            countArray[i] += countArray[i-1];
        }

        System.out.print("Cumulative sum count array: ");
        for (int i = 0; i < max+1; i++) {
            System.out.print(countArray[i]+" ");
        }

        int[] outputArray = new int[100];

        for (int i = size-1; i >= 0; i--) {
            outputArray[countArray[arr[i]]-1] = arr[i];
                    --countArray[arr[i]];
        }

        System.out.print("\nArray after counting sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(outputArray[i]+" ");
        }

    }
}