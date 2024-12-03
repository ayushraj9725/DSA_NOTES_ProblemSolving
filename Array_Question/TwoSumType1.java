import java.util.*;
public class TwoSumType1 {
    public static String read(int n, int []book, int target){
        /*      for(int i = 0 ; i < n ; i++){
                  for(int j = 0 ; j < n ; j++){
                      if(i == j) continue ;
                      if(book[i] + book[j] == target){
                          return "YES" ;
                      }
                  }
              }
              return "NO" ;
              */
        // this is taking O(N*N) time complexity 
        // and space has not used so O(1) S.C.
    
    
        // some changes in bruute force the code 
        // not need to check last if i moved the i 
     /*        
             for(int i = 0 ; i < n ; i++){
                 for(int j = i+1 ; j < n ;j++){
                     if(book[i] + book[j] == target){
                         return "YES" ;
                     }
                 }
             }
             return "NO" ;
    */
    /*
    
          // here's the better solution code
           HashMap<Integer,Integer> m = new HashMap<>();
    
            for(int i = 0 ; i < book.length ; i++){
                int c = book[i] ;  // current element of nums
                int d = target - c ; // difference checking containing in hashmap or not
                if(m.containsKey(d)){
                      return "YES" ;
                }
                m.put(book[i],i);
            }
            return "NO" ;
       // my task has done in only one loop so time reduired O(N)
       // and space used here in hashmap in worth case O(N) .
      */
    
    // Let's Optimized the code (Optimal approach)
           
          int  i = 0 , j = n - 1 ;
          Arrays.sort(book); // O(nlogn) used time
    
          while(i < j){
              int sum = book[i] + book[j] ;
              if(sum == target){
                  return "YES" ;
              }
              else if(sum < target){
                  i++ ;
              }
              else {
                  j-- ;
              }
          }
          
           return "NO" ;
    
    // used time to say "yes" O(N) only without using extra space
    // overall O(N) + O(nlogn)  
    // so space complexity will O(1) .
    
    
    
    
    
    
    
    
    
    
    
    
        }
}
