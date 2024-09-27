import java.util.Scanner;

public class Main {
    public static String convert(int num) {

        String[] first_twenty = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num < 0) {
            return "Zero";
        }

        if (num < 20) {
            return first_twenty[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " : "") + first_twenty[num % 10];
        }

        if (num < 1_000) {
            return first_twenty[num / 100] + " Hundred" + ((num % 100 != 0) ? " " : "") + convert(num % 100);
        }
        if (num < 100_000) {
            return convert(num / 1_000) + " Thousand" + ((num % 10_000 != 0) ? " " : "") + convert(num % 1_000);
        }

        if (num < 10_000_000) {
            return convert(num / 100_000) + " Lakh" + ((num % 100_000 != 0) ? " " : "") + convert(num % 100_000);
        }

        return "Out of range: Max is 9_999_999";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String result = convert(num);

        System.out.println(result);
    }
}