
public class Main {
    public static void main(String[] args) {
        int temp=2;
        if(temp>30){
            System.out.println("Its hot");
            System.out.println("drink plenty of water");
        }
        else if (temp>20){
            System.out.println("Beautiful day");
        }
        else
            System.out.println("cold day");
        int income=120_000;
        boolean hasHighIncome=( income>100_000 );
        System.out.println(hasHighIncome);
    }
}
