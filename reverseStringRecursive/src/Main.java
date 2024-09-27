public class Main {

    // Method to reverse a string recursively
    public static String reverse(String str) {
        // Base case: if the string is empty or has one character, return it
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: last character + reverse of the remaining string
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}