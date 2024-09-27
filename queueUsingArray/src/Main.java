import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static int insert(int[] queue, int number, int rear){
        rear = rear+1;
        queue[rear]= number;
        return rear;
    }

    public static void display(int[] queue, int front, int rear){
        if(front>rear){
            System.out.print("Queue is empty!");
            return;
        }
        System.out.print("\nCurrent queue: ");
        for (int i = front; i <=rear; i++) {
            System.out.print(queue[i]+" ");
        }
    }
    public static int delete(int[] queue, int front, int rear){
        if(front > rear) {
            System.out.print("Queue is empty!!");
            return front;
        }
        front++;
        System.out.println("Element deleted...");
        return front;
    }

    public static void main(String[] args) {
        int[] queue = new int[1000];
        Scanner s = new Scanner(System.in);

        int front = 0;
        int rear = -1;
        int number;
        while(true){
            System.out.println("\n1. Insert\t 2.Delete\t 3.Display the contents\t 4.Exit");
            int option = s.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter the number you want to insert: ");
                    number = s.nextInt();
                    rear = insert(queue, number, rear);
                    break;
                case 2:
                    front = delete(queue, front, rear);
                    break;
                case 3: display(queue, front, rear);
                    break;
                case 4: exit(0);
                    break;
            }
        }
    }
}