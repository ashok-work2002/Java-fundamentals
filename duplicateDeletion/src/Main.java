import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int range = s.nextInt();
        int[] array = new int[100];
        int[] flag = new int[100];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < range; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < range; i++) {
            flag[array[i]] = 0;
        }
        for (int i = 0; i < range; i++) {
            if(flag[array[i]]==0)
                flag[array[i]]=1;
            else {
                for (int j = i; j < range; j++)
                    array[j] = array[j + 1];
                range--;
            }
        }
        System.out.print("New array after deletion of duplicate elements: ");
        for (int i = 0; i < range; i++) {
            System.out.print(array[i]+" ");
        }
    }
}