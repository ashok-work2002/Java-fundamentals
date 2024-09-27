
public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 6, 37, 29, 11, 35, 21, 22};

        System.out.println("Array: ");
        for (int i : arr)
            System.out.print(i + "\t");

        int max = arr[0];
        for (int j : arr)
            if (j > max)
                max = j;

        int[] bucket = new int[max+1];

        for (int i = 0; i <= max; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (bucket[i] > 0) {
                arr[index++] = i;
                bucket[i]--;
            }
        }

        System.out.println("\n\nSorted");
        for (int i: arr)
            System.out.print(i+"\t");
    }
}