import java.util.ArrayList;

public class PeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Optimal Approach : binary Search

        int n = arr.size();
        if (n == 1)
            return 0;
        if (arr.get(0) > arr.get(1))
            return 0;
        if (arr.get(n - 2) < arr.get(n - 1))
            return n - 1;
        int i = 1, j = n - 2;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1)) {
                return mid;
            }
            // if not execute above then check for sorted or not so we can eliminate one
            // part which is sorted in ascending
            if (arr.get(mid - 1) < arr.get(mid))
                i = mid + 1; // eliminated left part
            else
                j = mid - 1; // eliminated right part
        }
        return -1;

        /*
         * // Brute force Approach /
         * int n = arr.size();
         * for(int i = 0 ; i < n ;i++){
         * if((i == 0 || arr.get(i-1) < arr.get(i))
         * && (i == n-1 || arr.get(i) > arr.get(i+1))) return i ;
         * }
         * 
         * return -1 ;
         * 
         */

        // 2nd way

        /*
         * 
         * public int findPeakElement(int[] nums) {
         * int n = nums.length ;
         * if(n == 1) return 0 ; // if array has only one element that is the peak
         * if(nums[0] > nums[1]) return 0 ; // when array has peak at 1st index like
         * [5,4,3,2,1]
         * if(nums[n-2] < nums[n-1]) return n-1; // whn ary has peak at last ind like
         * [1,2,3,4,5]
         * // now check for binary search from excepting 1st and last index
         * int low = 1 , high = n - 2 ;
         * while(low <= high){
         * int mid = low + (high - low) / 2 ;
         * if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid+1]){
         * return mid ;
         * }
         * // if not found then check for elimination , checking for srted part
         * else if(nums[mid] > nums[mid-1]) low = mid + 1 ; // left eliminated
         * else high = mid - 1 ; // right will go to elimination
         * }
         * return -1 ;
         * }
         * 
         */

    }
}
