public class SearchInsertEle {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                j = mid - 1;

            } else {
                i = mid + 1;
            }
        }
        return i;

        /*
         * using lowerbound we can do this
         * 
         * 
         * public static int lowerbound(int []arr, int x, int n){
         * // Upper Bound
         * int i = 0 , j = n - 1 ;
         * int ans = n ;
         * while(i <= j){
         * int mid = i + (j - i)/2;
         * if(arr[mid] >= x){
         * ans = mid ;
         * j = mid - 1 ;
         * }
         * else{
         * i = mid + 1 ;
         * }
         * }
         * return ans ;
         * }// time complexity = O(log2n) Binary search
         */
    }
}
