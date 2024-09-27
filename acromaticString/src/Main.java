import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = s.nextLine();
        System.out.print("Acromatic string is: ");
        System.out.print(sentence.charAt(0));
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' ')
                System.out.print(sentence.charAt(i+1));
        }
    }
}