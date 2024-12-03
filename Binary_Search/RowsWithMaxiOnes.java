import java.util.ArrayList;

public class RowsWithMaxiOnes {
     public static int LowerBound(ArrayList<Integer> arr , int n , int x){
        int i = 0 , j = n - 1 ;
        int lowerBound = n ; // if the lower found not found then we return that n 
        while(i <= j){
            int mid = i + (j - i) / 2 ;
            if(arr.get(mid) >= x){
                lowerBound = mid ;
                j = mid - 1 ; // we are finding lowerbound so triming the right part after taking 
            }else{
                i = mid + 1 ;
            }
        }
        return lowerBound ;
    }
    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {

       // Optimal Solution - use binary search for LowerBound
        int maxCnt = 0 ;
        int ind = -1 ;
        for(int i = 0 ; i < n; i++){
            
            int cntOnes = m - LowerBound(mat.get(i),m,1) ; // this is finding the apprears one in each row one by one
            if(cntOnes > maxCnt){ // when cntOnes exceed the maxCnt than maxCnt change like
                 maxCnt = cntOnes ;
                 ind = i ;
            }
        }
         return ind ; // return the that row 

         // time Complexity : O(N * Log2m) ;


     /*          // Brute Force Solution .
        int ind = -1 , max = 0 ; // it hold the max time appeares ans ind hold which row 
        for(int i = 0 ;i < n ;i++){
            int countRow = 0 ;
              if (mat.get(i) == null) {
            continue; // Skip null rows
        }
            for(int j = 0; j < m ;j++){
                countRow += mat.get(i).get(j) ; // we are counting using 0,1 addition being in matrix
            }
            // here we are update the max if countRow goes greater than max and hold that particular index in ind variable 
            if(countRow > max){
                max = countRow ;
                ind = i ; // stored there the row which have maximum one's
            }
        }
        return ind ; // return here only the max time appears 1's in row ;
        // time complexity : O(N * M) and space complexity : O(1)

        */

       
    }
}
