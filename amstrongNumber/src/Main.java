import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static int isAmstrong(int number){
        int digit;
        int numberCopy = number;
        int numberCopy2 = number;
        int sum = 0;
        int num =0;
        while (numberCopy2 > 0){
            numberCopy2 = numberCopy2/10;
            num++;
        }

        while (number > 0){
            digit = number % 10;
            sum = (int) (sum + pow(digit, num));
            number = number/10;
        }
        if(numberCopy == sum) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if(isAmstrong(i)==1)
                System.out.println(i+" is a armstrong number");
        }
    }

}