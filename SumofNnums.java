public class SumofNnums {

    static int Sum (int n){ 
        int sum = 0;
        sum = n + Sum((n)+((n-1)*(n-1+1)/(2)));
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("SUm of first 5 natural numbers is: " + Sum(n));
    }
    
}
