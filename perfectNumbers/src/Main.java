import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the limit: ");
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();

        for (int i = 1; i < limit; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if ( i % j == 0){
                    sum += j;
                }
            }
            if(sum == i)
                System.out.println(sum+" is a perfect number!");

        }
    }
}