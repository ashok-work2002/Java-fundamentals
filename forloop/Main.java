
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            System.out.println("*"+i);
        }
        for(int i=5; i>0;i--){
            System.out.println("TT"+i);
        }

        String[] fruits= {"apple", "mango","orange"};

        for(int i=0;i< fruits.length;i++){
        
            System.out.println(fruits[i]);
        }

        for(String fruit:fruits){
            
            System.out.println(fruit);
        }

    }
}