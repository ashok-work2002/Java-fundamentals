import java.util.Scanner;
class Main{

    public static int occurrenceOfWord(String paragraph, String word){
        int wordLength = word.length();
        int paragraphLength = paragraph.length();

        for (int i = 0; i < paragraphLength; i++) {
            int j = 0;
            if(i ==0 || (paragraph.charAt(i-1)==' '))
                for (j = 0; j < wordLength; j++) {
                    if(paragraph.charAt(i+j) != word.charAt(j))
                        break;
                }
            if(j == wordLength && (i + j == paragraphLength || paragraph.charAt(i + j) == ' ' || paragraph.charAt(i + j) == '\n')){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = s.nextLine();
        System.out.print("Enter the word you want to search: ");
        String word = s.next();

        int index = occurrenceOfWord(paragraph, word);
        if(index==-1)
            System.out.println("Word not found!");
        else
            System.out.print("Found at index "+index);
    }
}