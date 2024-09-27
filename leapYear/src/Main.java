import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a year to check leap year or not: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if( (year % 400 == 0) || (year % 100 !=0 && year % 4 == 0))
            System.out.print("It is a leap year!");
        else
            System.out.print("Not a leap year");
    }
}