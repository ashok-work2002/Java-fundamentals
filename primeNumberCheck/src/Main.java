import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Checking prime number or composite number....");
        System.out.println("Enter the number you want to check: ");
        int number = s.nextInt();
        if (number == 1) {
            System.out.print("It is a unit number");
            exit(0);
        }
        int numberOfFactors = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                numberOfFactors++;
        }
        if (numberOfFactors == 0)
            System.out.print("It is a prime number!");
        else
            System.out.print("It is a composite number!");
    }
}