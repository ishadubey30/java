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

//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNext()) {
//         if (scanner.hasNextInt()) {
//         int number = scanner.nextInt();
//         System.out.println("You entered an integer: " + number);
//         } else {
//         String nonNumber = scanner.next();
//         System.out.println("Not an integer: " + nonNumber);
//         }
// }
        // float a = 7/4f * 9/4f;
        // System.out.println(a);
        // char Grade = 'A'  ;
        // char Grade1 = (char)('A' + 8);
        // System.out.println(Grade1);
        //     // scanner.close();
        Scanner sc = new Scanner(System.in);
        float num_in_km = sc.nextInt();
        float num_in_miles = (0.62f) * num_in_km;
        System.out.println(num_in_miles + "miles");
        sc.close();
    }
}


