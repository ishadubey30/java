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
     

        int n = 6;
        int start = 1 ;
        for(int i = 0 ; i<=n ; i++){

            if(i%2 == 0 ) start = 1;
            else start = 0;

            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
        

    }
}