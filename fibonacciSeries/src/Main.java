import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int temp;
        System.out.print("Enter range: ");
        int range = s.nextInt();
        System.out.println("Fibonacci series of first "+range+" numbers: ");
        System.out.print("0 1");
        for (int i = 0; i < range-2; i++) {
            temp = num1+num2;
            System.out.print(" "+temp);
            num1=num2;
            num2=temp;
        }
    }
}