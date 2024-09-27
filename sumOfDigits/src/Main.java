import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int digit;
        int sum = 0;
        while (number > 0){
            digit = number % 10;
            sum += digit;
            number = number/10;
        }
        System.out.print("Sum of digits: "+ sum);
    }

}