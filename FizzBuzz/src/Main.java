import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Program\n");
        System.out.print("Enter a Number:");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if(number%5 == 0 && number%3 ==0){
            System.out.println("FizzBuzz");
        }
        else if(number%5==0)
            System.out.println("Fizz");
        else if(number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}