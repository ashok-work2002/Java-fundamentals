import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = s.nextInt();
        int num;
        for (int i = 1; i <= limit; i++) {
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            num=0;
            for (int k = 1; k <= i; k++) {
                System.out.print(++num+" ");
            }
            System.out.println();
        }
    }
}
