
public class Main {
    public static void main(String[] args) {
        String role="admin";
        switch (role){
            case "admin":
                System.out.println("Hi admin");
                break;
            case "moderator":
                System.out.println("hi moderator");
                break;
            default:
                System.out.println("enter valid input");
        }
    }
}