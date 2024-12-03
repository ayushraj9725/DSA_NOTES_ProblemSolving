import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maths4 {
    public static List<Integer> printDivisors(int n) {
        // Write your code here
        
      // it is taking  complexity 
        List<Integer> divisor = new ArrayList<>();
        for(int i = 1 ; i <= (int)Math.sqrt(n) ; i++){
            if(n % i == 0){
                divisor.add(i); // O(sqrt(n)) time complexity
                if((n / i) != i){
                divisor.add(n/i); // 
            }
          }
        }
        Collections.sort(divisor); // O(n log(n))
        return divisor ;  // if we print then O(n) also we have to add
  
       /* List<Integer> divisors = new ArrayList<>();
        for(int i = 1 ; i <= n ;i++){
            if(n % i == 0){
                divisors.add(i);
            }
        }
        Collections.sort(divisors);
        return divisors ;
        */ // this take O(N + n(logn)) time complexity 
    }
}
