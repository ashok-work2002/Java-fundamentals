import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        // Using FileInputStream and FileOutputStream

        try {
            OutputStream os = new FileOutputStream("test.txt");
            os.write("Hello world".getBytes());
            os.close();
        } catch (IOException e) {
            System.out.println(""+e);
        }


        try {
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size ; i++) {
                System.out.print((char)is.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}