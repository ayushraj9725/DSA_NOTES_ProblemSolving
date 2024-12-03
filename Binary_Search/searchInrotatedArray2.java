public class searchInrotatedArray2 {
    public class Solution {
        public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
            // Optimal Approach : Binary Search
            int n = A.length;
            int i = 0, j = n - 1;
            while (i <= j) {
                int mid = (i + j) / 2;
                if (A[mid] == key)
                    return true;
                if (A[i] == A[mid] && A[mid] == A[j]) {
                    i = i + 1;
                    j = j - 1;
                    continue;
                }
                if (A[i] <= A[mid]) { // left is sorted , try to eliminate some part
                    if (A[i] <= key && key <= A[mid]) {
                        j = mid - 1; // right removed
                    } else
                        i = mid + 1; // left removed
                } else {
                    if (A[mid] <= key && key <= A[j]) {
                        i = mid + 1; // left removed
                    } else
                        j = mid - 1; // right removed
                }
            }
            return false;
            // time used to perform this : O(log2n)

            /*
             * // Brute Force
             * for(int i = 0 ; i < A.length - 1 ;i++){
             * if(A[i] == key) return true ;
             * }
             * 
             * return false ; // O(N) time complexity
             */

        }
    }
}
