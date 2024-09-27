import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String line1, line2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the contents to file1: ");
        line1 = s.nextLine();
        System.out.print("Enter the contents to file2: ");
        line2 = s.nextLine();
        try{
            FileWriter f1 = new FileWriter("file1.txt");
            FileWriter f2 = new FileWriter("file2.txt");
            BufferedWriter wr = new BufferedWriter(f1);
            wr.write(line1);
            BufferedWriter wr2 = new BufferedWriter(f2);
            wr2.write(line2);

            wr.close();
            wr2.close();

            BufferedReader fileReader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader fileReader2 = new BufferedReader(new FileReader("file2.txt"));

            String file1Contents = fileReader1.readLine();
            String file2Contents = fileReader2.readLine();

            FileWriter f3 = new FileWriter("output.txt", false );
            f3.write(file1Contents);
            f3.write(file2Contents);
            System.out.print("\nContents written to output.txt");

            f1.close();
            f2.close();
            f3.close();

        } catch (IOException e) {
            System.out.print(e);
        }


    }
}