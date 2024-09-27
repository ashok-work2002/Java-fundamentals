import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to condense: ");
        int number = s.nextInt();
        int sum = 0;
        int digit;
        System.out.print("Condensed number:");
        if(number>9){
            do {
                sum =0;
                while(number>0){
                    digit = number % 10;
                    sum += digit;
                    number /= 10;
                }
                number = sum;
            }while(sum>9);
            System.out.println(sum);
        }
        else
            System.out.print(number);
    }
}