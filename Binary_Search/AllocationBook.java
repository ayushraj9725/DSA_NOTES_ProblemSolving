
    
import java.util.ArrayList;
import java.util.Collections;
public class AllocationBook {

    public static int countPages(ArrayList<Integer> arr, int n, int pages) {
        int countBook = 1, pageStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pageStudent + arr.get(i) <= pages) {
                pageStudent += arr.get(i);
            } else {
                countBook++;
                pageStudent = arr.get(i);
            }
        }
        return countBook;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // OPTIMAL SOLUTION : BINARY SEARCH
        if (n < m)
            return -1; // this is the impossible case for distribution of book to student
        int low = Collections.max(arr), high = 0; // lowest minimum bound is the max of arr
        for (int i = 0; i < n; i++) {
            high += arr.get(i); // we get the sum here and it is last possible bound
        }
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cp = countPages(arr, n, mid); // mid is pages
            if (cp <= m) {
                ans = mid;
                high = mid - 1; // we are looking for min but that max so eliminate left half after knowing

            } else
                low = mid + 1; // triming the right half that means answer not found yet
        }
        return ans; // we can return here right also due to opposite polarity of possiblity of yes
                    // or not at the end of the bianry search while loop

        /*
         * // Brute Force Approach : Linear Search
         * int low = Collections.max(arr) , high = 0 ; // lowest minimum bound is the
         * max of arr
         * for(int i = 0 ; i < n ;i++){
         * high += arr.get(i); // we get the sum here and it is last possible bound
         * }
         * // apply linear Search
         * for(int pages = low ; pages <= high ;pages++){
         * int cp = countPages(arr,n,pages);
         * if(cp == m){
         * return pages;
         * }
         * }
         * return -1 ;
         */

    }
}

