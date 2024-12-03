public class maths18 {
    public static boolean isPowerOfTwo(int n){
        // Write your code here.
 
    /* int i = 0 ;
     while(i <= n/2){
         if((int)Math.pow(2,i) == n){
             return true ;
         }
         i++ ;
     }
     return false ; */
     

     if((n & n - 1) != 0){
         return false ;
     } 

     return true ;
    }

     /* public static boolean isPowerOfTwo(int n) {
    // Check if n is greater than 0 and n & (n - 1) == 0
    return n > 0 && (n & (n - 1)) == 0; */
}
