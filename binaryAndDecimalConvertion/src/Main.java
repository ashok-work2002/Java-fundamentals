import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void decimalToBinary(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = s.nextInt();
        int[] binary = new int[100];
        int i = 0;
        while(decimal > 0){
            binary[i] = decimal % 2;
            decimal /= 2;
            ++i;
        }
        binary[i]='\0';

        System.out.print("Binary Number: ");
        for (int j = i-1; j >= 0; j--) {
            System.out.print(binary[j]+" ");
        }
        System.out.println();
    }

    public static void binaryToDecimal(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        int binaryNumber = s.nextInt();
        int rem = 0, valuePower=0;
        int sum=0;
        while(binaryNumber>0){
            rem = binaryNumber % 10;
            if(rem!=0){
                System.out.println("Not a binary number! \nEnter a valid binary number: ");
            }
            sum = (int) (sum + rem*Math.pow(2, valuePower));
            binaryNumber /= 10;
            valuePower++;
        }
        System.out.println("Decimal Number: "+sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Choose an option...\n 1. Decimal to Binary Conversion \n 2. Binary to Decimal Conversion \n 3.Exit");
            String input = s.next();

            switch (input) {
                case "1": decimalToBinary();
                            break;
                case "2": binaryToDecimal();
                            break;
                case "3": exit(0);
            }
        }while(true);
    }
}