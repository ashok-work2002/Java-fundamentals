import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = s.nextInt();
        int num=0;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(++num+"\t");
            }
            System.out.println();
        }
    }
}