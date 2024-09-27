import java.util.Scanner;

abstract class Main {
    int id;
    String name;
    double mark;

    Main(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    public String status() {
        if (mark>40)
            return "Pass";
        else
            return "Fail";
    }
}

public class Abstraction extends Main {
    Abstraction(int id, String name, double mark) {
        super(id, name, mark);
    }

    public static void main(String[] args) {
        int mark;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur mark obtained: ");
        mark = s.nextInt();
        System.out.println();
        Abstraction res = new Abstraction(1,"Ashok", mark);
        System.out.println("Result : "+ res.status());

    }
}
