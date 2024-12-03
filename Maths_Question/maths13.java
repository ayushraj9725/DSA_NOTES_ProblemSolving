public class maths13 {
    public static int fibonacciNumber(int n){
        // Write your code here.

        int mod = 1000000007 ;

        if(n == 0){
            return 0 ;
        }

        if(n == 1 ){
            return 1 ;
        }

        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        
        for(int i = 2 ;i <= n ;i++ ){

            c = (a + b) % mod;

            a = b ;
            b = c ;
            
        }
        
      return c ;
    }
}