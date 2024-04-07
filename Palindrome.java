public class Palindrome {

    public static void main(String[] args) {
        // int num = 12321;
        // String string =  String.valueOf(num);
        // String rev_String = "";
        // for(int i = string.length() - 1; i >= 0; i--){
        //     rev_String += string.charAt(i);
            
        // }
      
        // if (rev_String.equals(string)){
        //     System.out.println("this is palindrome");
    
        // }else {
        //     System.out.println("not a palindrome");
        // }

        // for(int i=0; i<=4 ; i++){
        //     for (int j = 4 ; j>i ; j--){
        //   System.out.print("*");
        // }
        //     System.out.println();
        // }

        int n = 5;
        int fact = 1 ;
        for(int i=1; i<=n; i++){
             fact *= i;
             System.out.println(fact);

        }
        // System.out.println(fact);
    }
}