import java.util.*;
public class Count_subArray_XOR {
    public static int subarraysWithSumK(int []a, int b) {
        // Brute force 
  /*      int n = a.length;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ;j++){
                int xor = 0 ;
                for(int k = i ; k <= j ;k++){
                    xor = xor ^ a[k];
                }
                if(xor == b) count++ ;
            }
        }

        return count ;
     */


        // better approach
/*
         int n = a.length;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
               int xor = 0 ;
            for(int j = i ; j < n ;j++){
                xor = xor ^ a[j];
                if(xor == b) count++ ;
            }
        }

        return count ;

*/

//  most optimal approach : using xor and hashmap

      int n = a.length;
      int count = 0 ;
      int xr = 0 ;
     HashMap<Integer,Integer> hm = new HashMap<>();
      hm.put(0,1);

      for(int i = 0 ; i < n ; i++){
          xr = xr ^ a[i]; // calculating entire xor till i from initial 
          int x = xr ^ b ; // calculating frunt xor 

          if(hm.containsKey(x)){
              count = count + hm.get(x);
          }
          if(hm.containsKey(xr)){
              hm.put(xr,hm.get(xr) + 1);
          }
          else{
              hm.put(xr,1);
          }
      }
     return count ;


// time complexity will be O(N) and space complexity O(N) because used n space to store xr as key in the hashmap











        
    }
}
