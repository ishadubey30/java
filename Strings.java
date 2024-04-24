
public class Strings {
    public static void main(String[] args){
    //     int n = 4;
    //     for(int i=0 ; i<n ; i++ )
    //     {
    //         for(int j = 0 ; j<=i ; j++)
    //         {
    //         System.out.print("*");
    //     } System.out.println();
    // }

        String name = "Ishassss   ";
        String name1 = new String("harry");
        System.out.println(name1.length());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name1.substring(1 ,3)); // endindex - 1 tak result aatae
        System.out.println(name1.substring(3));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("n")); // gives a boolean to check if it ends with n
        System.out.println(name.startsWith("n")); // gives a boolean to check if it ends with n
        System.out.println(name.indexOf( "h",0)); // expects char or string

        System.out.println(name.lastIndexOf("s" , 3));
        System.out.println(name.equals("harry"));
        System.out.println(name.replace('s' , 'p'));
        

        
        

 



    }}