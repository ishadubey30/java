/**
 * loops
 */
public class loops {

    public static void main(String[] args) {

        // for(int i = 0 ; i<=5 ; i++){
        //     for( int j = 1 ; j<=i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        //  for(int i = 0 ; i<=5 ; i++){
        //     for( int j = 1 ; j<=i ; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i = 0 ; i<=5 ; i++){
        //     for( int j = 5 ; j>i ; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 5 ; i>0 ; i--){
        //     for( int j = 1 ; j<=i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //    for(int i = 0 ; i<=5 ; i++){
        //     for(int j = 5 ; j>i ; j--){
        //         System.out.print("  ");
        //     }
        //     for( int j = 0 ; j< 2* i + 1 ; j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }
     

        // int n = 6;
        // int start = 1 ;
        // for(int i = 0 ; i<=n ; i++){

        //     if(i%2 == 0 ) start = 1;
        //     else start = 0;

        //     for(int j=0;j<=i;j++){
        //         System.out.print(start);
        //         start = 1-start;
        //     }
        //     System.out.println();
        // }
    
        // int [] arr = {1,2,3,4,5};
        // int [] arr2 = new int [2 * arr.length];
        // for(int i = 0 ; i < arr.length ; i++){
        //     // arr2[i] += arr[i];
        //     arr2[i] = arr[i];
        //     arr2[i + arr.length] = arr[i];
        //     System.out.println(arr2[i]);
            
        // }
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i] + " ");
        // }
    
        // int num = 38;
        // while(num >= 10){
        //     int sum = 0;
        //     while(num > 0) {
        //         sum += num % 10;
        //         num /= 10;
        //     } num = sum;
        //     }
        //     System.out.println(num);

        
        // switch (3) {
        //     case 2: System.out.println("hy");
                
        //         break;
        //     case 4:
        //         System.out.println("bye");
        //         break;
        
        //     default:
        //     System.out.println("nothing");
        //         break;
        // }

        // for(int i = 0 ; i<5 ; i++){


        //     for( int j = 1 ; j<=i ; j++){
        //         System.out.print(j);
        //     }
           
        //     System.out.println();
        // }

        int n = 5;
        for (int i = 0; i < n * 2; i++) {
            if (i> n) {
                for (int j = 1; j <= 2* n - i; j++) {
                    System.out.print("* ");
                }
               
            } else {
                for (int j = 0  ; j< i ; j++) {
                    System.out.print("* ");
                }     
            }
            System.out.println();
            
        }




    }
}