import java.util.InputMismatchException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the first number: ");
            
            int num1 = scanner.nextInt();
            
            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}