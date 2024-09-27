import java.util.Scanner;

public class Main {
    public static void numberOfWords(String paragraph){
        int count = 1;
        for (int i = 0; i < paragraph.length(); i++) {
            if(paragraph.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("number of words: "+count);
    }
    public static void smallestAndBiggest(String paragraph) {
        String[] wordArray = paragraph.split(" ");


        for (int i = 0; i < wordArray.length; i++) {
            String temp;
            for (int j = i+1; j < wordArray.length; j++) {
                if (wordArray[j].length() < wordArray[i].length()) {
                    temp = wordArray[j];
                    wordArray[j] = wordArray[i];
                    wordArray[i] = temp;
                }
            }
        }
        int largeCount = wordArray[wordArray.length-1].length();

        System.out.print("Largest words: ");
        int secondLargeCount = 0;
        for (int i = wordArray.length-1; i >= 0; i--) {
            if(wordArray[i].length()==largeCount){
                System.out.print(wordArray[i]+" ");
            }
            else{
                secondLargeCount = wordArray[i].length();
                break;
            }
        }

        System.out.print("\nSecond largest words: ");
        for (int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].length()==secondLargeCount){
                System.out.print(wordArray[i]+" ");
            }
        }

        int secondSmallest = 0;

        System.out.print("\nSmallest words: ");
        for (int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].length()==wordArray[0].length()){
                System.out.print(wordArray[i]+" ");
            }
            else {
                secondSmallest = wordArray[i].length();
                break;
            }
        }

        System.out.print("\nSecond Smallest words: ");
        for (int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].length()==secondSmallest){
                System.out.print(wordArray[i]+" ");
            }
            else
                secondSmallest = wordArray[i].length();
        }

        System.out.print("\nSorted array: ");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(wordArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = s.nextLine();
        numberOfWords(paragraph);
        smallestAndBiggest(paragraph);

    }
}