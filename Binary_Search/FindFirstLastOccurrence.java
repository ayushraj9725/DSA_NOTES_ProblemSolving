import java.util.ArrayList;

public class FindFirstLastOccurrence {
     public static int lowerBound(ArrayList<Integer> a, int n, int k){
        int i = 0 , j = n - 1 ;
        int lower_bound = n ;
        while(i <= j){
            int mid = (i + j)/2 ;
            if(a.get(mid) >= k){
                lower_bound = mid ;
                j = mid - 1 ;
            }
            else i = mid + 1 ;
        }
        return lower_bound ;
    }
    public static int upperBound(ArrayList<Integer> a , int n, int k){
        int i = 0 , j = n - 1 ;
        int upper_bound = n ;
        while(i <= j){
            int mid = (i + j)/2 ;
            if(a.get(mid) > k){
                upper_bound = mid ;
                j = mid - 1 ;
            }
            else i = mid + 1 ;
        }
        return upper_bound ;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {

        // Optimal approach 1
         //find using the lower bound and upper bound .
        // writing and calling function for both lower and upper bound .

       int lb = lowerBound(arr,n,k);
       if(lb == n || arr.get(lb) != k){
            return new int[]{-1,-1};
       }
       int up = upperBound(arr,n,k);
       return new int[]{lb,up-1};

       // time used O(2(log2n))  .





        // Brute Force Approach ;
        // we have sorted array so finding both index using linear search 
      /*  int first = -1 , last = -1 ;
        for(int i = 0 ; i < n ; i++){
            if(arr.get(i) == k){
                if(first == -1) first = i ;

                last = i ;
            }
        }

        return new int[]{first,last};

        // O(N) time complexity and space O(1)

        */

    }

}
