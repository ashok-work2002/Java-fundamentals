import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int digit;
        System.out.print("The reversed number is: ");
        while (number > 0){
            digit = number % 10;
            System.out.print(digit+" ");
            number /= 10;
        }
    }
}