import java.util.*;

public class searchInrotatedArray {
    public static int search(ArrayList<Integer> arr, int n, int k) {

        // Optimal Approach
        int i = 0, j = n - 1;
        int target = k;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr.get(mid) == target)
                return mid; // find simple we return just
            // if not then we trying to find sorted side eitherleft or right
            if (arr.get(i) <= arr.get(mid)) { // left is sorted so we are eleminating left side
                if (arr.get(i) <= target && target <= arr.get(mid)) {
                    j = mid - 1; // is right eleminating
                } else
                    i = mid + 1; // left otherwise
            } else { // right is sorted
                if (arr.get(mid) <= target && arr.get(j) >= target) {
                    i = mid + 1; // left removing
                } else
                    j = mid - 1; // right removing
            }
        }

        return -1;

        /*
         * // Brute Force Approach : using Linear Search
         * for(int i = 0 ; i < n ;i++){
         * if(arr.get(i) == k) return i ;
         * }
         * return -1 ; // time complexity : O(N) linear search ''
         * 
         */
    }
}
