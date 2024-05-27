import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //for loop is a cleaner version, for loop is good in situations where we know the number of time the loops will execute
     // while loops good while we dont know how many times the loop executes
        int i=5;
        Scanner scanner=new Scanner(System.in);
       /* while (i>0){
            System.out.println("Hello");
            i--;
        }*/
        String input="";
        while(!input.equals("quit")){
            System.out.print("Enter Input: ");
            input=scanner.next().toLowerCase();
        }
    }
}