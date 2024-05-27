//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     String message="Hello world"+"!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.indexOf('l'));
        System.out.println(message.replace("!!","##"));
        //strings are immutable in java  i.e no one can modify it, only duplicates will be returned by functions
        System.out.println(message);
        System.out.println(message.toLowerCase());
        String messag1="   hello    ";
        System.out.println(messag1.trim());
    }
}