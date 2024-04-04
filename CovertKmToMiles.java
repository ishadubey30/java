import java.util.Scanner;
public class CovertKmToMiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in Km: ");
        int num_in_km = sc.nextInt();
        System.out.println((num_in_km * 0.621) + " miles" );
        }
}