public class Factorial {

    static int fact(int n) {
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * fact(n-1);
           
        }
    }
    public static void main(String[] args) {   
        
    int x=4;
    System.out.println("fact of 4 is " + fact(x));
}}