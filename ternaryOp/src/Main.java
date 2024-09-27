class Scratch {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.4, 4.3, 6.2, 3.6};
        double sum = 0;
        System.out.print("Elements of the array:");
        for(int i = 0; i < myList.length; i++) {
            System.out.print( myList[i]+", ");
        }

        for (int i = 0; i < myList.length; i++) {
            sum+=myList[i];
        }
        System.out.println("\nTotal sum:"+sum);

        double max = 0;

        for(double element : myList){
            if(element>max){
                max = element;
            }
        }
        System.out.println("Largest element = "+max);
    }
}