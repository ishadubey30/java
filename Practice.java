import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter an integer: ");
        // int number = scanner.nextInt();
        // System.out.println("Enter your name: ");
        // scanner.nextLine(); 
        // String name = scanner.nextLine();
        // System.out.println("You entered: " + number + " and your name is " + name);
        // ;  // Good practice to close resources

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        System.out.println("You entered an integer: " + number);
        } else {
        String nonNumber = scanner.next();
        System.out.println("Not an integer: " + nonNumber);
        }
}
scanner.close();
    }
}
