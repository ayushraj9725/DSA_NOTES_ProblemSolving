import java.util.*;
public class LeaderInArray {
    public static List< Integer > superiorElements(int []a) {
        /*       ArrayList<Integer> ans = new ArrayList<>();
     
               for(int i = 0 ; i < a.length ;i++){
                      boolean leader = true ;
                   for(int j = i+1 ; j < a.length ; j++){
                       if(a[j] >= a[i]){
                           leader = false ;
                           break ;
                       }
                   }
                   if(leader == true) ans.add(a[i]) ;
               } 
               Collections.reverse(ans) ;
               return ans ;
               // time complexity will be O(N^2) and space is not used here any 
               // only use list for returning the result that is not consider as defining the complexity 
               */
     
     
     
            // Optimal solution 
     
            ArrayList<Integer> result = new ArrayList<>();
            int max =Integer.MIN_VALUE ;
            for(int i = a.length - 1 ; i >= 0 ;i--){
                if(a[i] > max){
                    result.add(a[i]);
                    max = a[i];
                }
            }
            return result ;
     
            // time complexity taken here only O(N) because task 
            // done in one single loop 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
         }
}
