import java.util.ArrayList;

public class KthElementTwoSortedArr {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here 
      //  int n1 = arr1.size() , n2 = arr2.size() ;
        if(n > m) return kthElement(arr2,arr1,m,n,k) ; // we always want arr1 is smaller 
        int low = Math.max(0,k-m) , high = Math.min(k,n);
        int left = k ; // what we want to take in  left side an chooge largest from there this will help me to find exect that answer
        
        while(low <= high){
            int mid1 = (low + high)/2 ;
            int mid2 = (left - mid1) ;

            int l1 = (mid1 - 1 >= 0) ? arr1.get(mid1 - 1) : Integer.MIN_VALUE ;
            int l2 = (mid2 - 1 >= 0) ? arr2.get(mid2 - 1) : Integer.MIN_VALUE ;
            int r1 = (mid1 < n) ? arr1.get(mid1) : Integer.MAX_VALUE ;
            int r2 = (mid2 < m) ? arr2.get(mid2) : Integer.MAX_VALUE ;

            if(l1 <= r2 && l2 <= r1) {
                return Math.max(l1,l2);
            }
            else if(l1 > r2) high = mid1 - 1 ; // removing triming the right half 
            else low = mid1 + 1 ; // triming here the left half
        }

        return 0;
    } 
}
