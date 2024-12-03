import java.util.Collections;
import java.util.List;

public class NextPermutation2 {
     public static void reverse(List<Integer> l , int i , int j){
        while(i < j){
            int temp = l.get(i);
            l.set(i,l.get(j));
            l.set(j,temp);
            i++ ;
            j--; 
        }
    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
         int n = A.size();
         int ind = -1 ;

         for(int i = n -2 ; i >= 0 ; i--){
             if(A.get(i) < A.get(i+1)){
                 ind = i ;
                 break ;
             }
         }
         if(ind == -1) {
             Collections.reverse(A) ;
             return A ;
         }    

         for(int i = n - 1 ;i >= 0 ;i--){
             if(A.get(i) > A.get(ind)){
                  Collections.swap(A,i,ind);
                  break ;
             }
         }
         reverse(A,ind+1,n-1);
         return A ;  // over all time complexity will in worst case O(N + N + N) and space O(1)
    }
}
