public class findMinisortedArray {

    public static int findMin(int[] arr) {
        // finding the Minimum in rotated sorted array : using binary search
        int n = arr.length;
        int i = 0, j = n - 1, ans = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            // but if at that condition where array get already sorted
            // then most left will alwaly my ans according to sorting property
            // so we are minimizing here time , ther is no need to do for again binary
            // search
            if (arr[i] <= arr[j]) {
                ans = Math.min(ans, arr[i]);
                break;
            }
            // identifing the rotated array so that we can take minimest from there and
            // eliminitae them
            if (arr[i] <= arr[mid]) {
                ans = Math.min(ans, arr[i]); // if the left arry is sorted ,then its left most is lowest
                i = mid + 1; // here removed the left after taking minimest from that
            } else { // if left part is not sorted then right part defenately sorted so here remove
                     // right after takin minimest from this part
                ans = Math.min(ans, arr[mid]); // if right part is sorted then mid is most left lowest
                j = mid - 1; // right part removed

            }
        }
        // and after that at the end of the day , we will get ans minimest ele
        return ans; // time complexity : O(log2n)

        // brute force of this problem is to find minimest in array that will be done in
        // O(N)

        /*
         * public int findMin(int[] nums) {
         * int i = 0 ;
         * int j = nums.length - 1 ;
         * // checking that case which already sorted
         * if(nums[i] < nums[j]) return nums[i] ;
         * 
         * while(i < j){
         * int mid = i + (j - i)/2 ;
         * if(nums[mid] > nums[j]){
         * i = mid + 1 ;
         * }
         * else j = mid ;
         * }
         * return nums[i] ;
         * 
         * // time complexity is O(log n) this is Binary Search Approach
         * 
         */
    }
}
