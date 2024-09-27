
import javax.management.StandardEmitterMBean;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File file = new File("frequency.txt");

        ArrayList<String> wordArray = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String ch = "";
            while ((ch = br.readLine()) != null) {
                wordArray.add(ch);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(wordArray);

        for (String word:wordArray) {
            String frequentWord = "";
            boolean same = false;
            int count = 1;
            for (int i = 0; i < word.length(); i++) {
                for (int j = i+1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        frequentWord += word.charAt(j);
                        same = true;
                        count++;
                    }
                }

            }
            System.out.println(word+" : "+frequentWord+", "+count+" times");


        }

    }
}