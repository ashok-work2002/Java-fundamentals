//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r=0,i;
        System.out.printf("Enter the number to reverse: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
           r=r*10+n%10 ;

           n=n/10;
        }
        System.out.println(r);
    }
}