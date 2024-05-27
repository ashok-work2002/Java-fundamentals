
public class Main {
    public static void main(String[] args) {
        int temprature=23;
        boolean isWarm=temprature>22 && temprature<30;
        System.out.println(isWarm);
   
        boolean hasHighIncome=true;
        boolean hasHighCredit=true;
        boolean hasCriminalRecord=false;
        boolean isEligible=(hasHighCredit || hasHighIncome) && !hasCriminalRecord;
        System.out.println(isEligible );
    }
}