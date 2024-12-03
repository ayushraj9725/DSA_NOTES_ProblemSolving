import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maths12 {
    public static List< Integer > countPrimes(int n) {
        // we are using here sieve of Eratosthenes algorithms which time complexity O(n log(log n)) 
        // space taking array filling value  tthat is O(n) space 
        List<Integer> list = new ArrayList<>();

        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);

        for(int i = 2 ; i*i < n; i++){
            if(isPrime[i]){
                for(int j = i*i ; j<n ;j = j + i){
                    isPrime[j] = false ;

                }
            }
        }
        for(int i = 2 ;i < n ;i++){    // here use n*n time checking  //we reduce it in diff approaches 
            if(isPrime[i]){
                for(int j = 2 ;j < n ; j++){
                    if(i * j == n){
                        list.add(i);
                    }
                }
            }
        }

      return list ;
    }
}
