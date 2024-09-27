import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;
import java.util.*;

import static java.lang.Math.pow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Principle:");
        Scanner s = new Scanner(System.in);
        double principle = s.nextDouble();
        System.out.print("Annual Interest Rate:");
        float annualInterest = s.nextFloat();
        System.out.print("Period (Years):");
        int numberOfYears = s.nextInt();

        float monthlyInterest = annualInterest/100/12;
        int numberOfPayments = numberOfYears*12;


        double mortgage = (principle*monthlyInterest*(Math.pow(1+monthlyInterest, numberOfPayments)))/(Math.pow(1+monthlyInterest, numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " +mortgageFormatted );
    }
}