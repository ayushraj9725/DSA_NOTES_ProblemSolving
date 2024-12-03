import java.util.ArrayList;

public class SingleEleInSortedArr {

    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        /*
         * // Optimization : Using Binary Search And Elimination
         * 
         * int n = arr.size() ;
         * if(n == 1) return arr.get(0) ;
         * if(arr.get(0) != arr.get(1)) return arr.get(0) ; // manually check for both
         * first and last elemt
         * if(arr.get(n-1) != arr.get(n-2)) return arr.get(n-1) ;
         * int i = 1 , j = n - 2 ; // start both pointer from first next and pre last
         * bcz of rarer chance to out of bound at last or first eleemnt of arry
         * while(i <= j){
         * int mid = i + (j - i) / 2 ;
         * if(mid > 0 && mid < n - 1 && arr.get(mid) != arr.get(mid-1) && arr.get(mid)
         * != arr.get(mid+1)) return arr.get(mid) ;
         * 
         * // now checking for elimination
         * else if((mid % 2 == 1 && arr.get(mid) == arr.get(mid-1) )||
         * (mid % 2 == 0 && arr.get(mid) == arr.get(mid+1) )){
         * i = mid + 1 ; // left part eliminated
         * }
         * 
         * else j = mid - 1 ; // right part eliminated
         * }
         * return -1 ;
         * 
         */

        // Brute force element
        int n = arr.size();
        if (n == 1)
            return arr.get(0);
        for (int i = 0; i < n; i++) {
            if (i == 0) { // at 1st element
                if (arr.get(i) != arr.get(i + 1))
                    return arr.get(i);
            } else if (i == n - 1) { // for the last containing element
                if (arr.get(i) != arr.get(i - 1))
                    return arr.get(i);
            } else {
                if (arr.get(i) != arr.get(i - 1) && arr.get(i) != arr.get(i + 1)) {
                    return arr.get(i);
                }
            }
        }
        return -1;

        /*
         * class Solution {
         * public int singleNonDuplicate(int[] nums) {
         * int n = nums.length ;
         * if(n == 1) return nums[0];
         * if(nums[0] != nums[1]) return nums[0];
         * if(nums[n-1] != nums[n-2]) return nums[n-1] ;
         * int i = 1 , j = n - 2 ;
         * while(i <= j){
         * int mid = (i+j)/2 ;
         * if(mid > 0 && mid < n-1 && nums[mid] != nums[mid-1] && nums[mid] !=
         * nums[mid+1]){
         * return nums[mid] ;
         * }
         * //we are in left half , remove left
         * if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
         * (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
         * i = mid + 1 ; // removed left part
         * }
         * else j = mid - 1 ; // removed right part
         * }
         * return -1 ;
         * }
         * }
         * 
         * 
         * 
         */
    }
}
