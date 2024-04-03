import java.util.Scanner;

public class PercentageCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of Subject1: ");
        int a = sc.nextInt();
        System.out.println("Enter Marks Of Subject2: ");
        int b = sc.nextInt();

        System.out.println("Enter Marks Of Subject3: ");
        int c = sc.nextInt();

        System.out.println("Enter Marks Of Subject4: ");
        int d = sc.nextInt();

        System.out.println("Enter Marks Of Subject5: ");
        int e = sc.nextInt();

        int percentage = ((a+b+c+d+e)*100)/(500);
        System.out.println(percentage + "%" );
        sc.close();
    }
    
}
