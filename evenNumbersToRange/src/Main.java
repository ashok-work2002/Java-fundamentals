import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Range: ");
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int i;
        for (i = 0; i <= range ; i++) {
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}