import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Range: ");
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int total = 0;
        int avg = 0;
        for (int i = 0; i <= range; i++) {
            if(i%2!=0) {
                System.out.print(i+" ");
                total += i;
            }
        }
        avg = total/((range+1)/2);
        System.out.println("Total = "+total);
        System.out.print("Average of Odd Numbers = "+avg);
    }
}