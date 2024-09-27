import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        readAndDisplay(inputFileName);
        duplicateFileContent(inputFileName, outputFileName);
    }

    public static void readAndDisplay(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Reading content from: " + fileName);

            System.out.print("File content: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + fileName);
        }
    }

    public static void duplicateFileContent(String sourceFileName, String destFileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFileName));

            String line;
            System.out.println("Duplicating content from " + sourceFileName + " to " + destFileName);

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error duplicating file content from " + sourceFileName + " to " + destFileName);
        }
    }
}
