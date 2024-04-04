import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class GreetsUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name = sc.nextLine();
        System.out.println("hello " + Name + ", Have a good Day.");
        sc.close();
    }
}
