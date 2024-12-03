public class SmallestDivisor {
    public static int Maxi(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int smallestDivisor(int arr[], int limit) {
        // Optimal Solution : Binary Search used
        int low = 1, high = Maxi(arr);
        int ans = 0;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            int sum_of_div = 0;
            for (int i = 0; i < arr.length; i++) {
                sum_of_div += Math.ceil((double) (arr[i]) / (double) (mid));
                // here mid is our divisor and we are dividing each element by this and
                // calculate sum and then checking
            }
            if (sum_of_div <= limit) {
                ans = mid;
                high = mid - 1; // we are looking for smallest so we have to trim right if we found any diviser
                                // follow the limit

            } else
                low = mid + 1; // other wise we are triming left if found sum is greater than limit or
                               // threshold
        }
        return ans; // time complexity : O(log2(max(arr)) * N)

        /*
         * // Brute force approach
         * int max_d = Maxi(arr) ;
         * for(int d = 1 ; d <= max_d ; d++){
         * int sum_of_div = 0 ;
         * for(int i = 0 ; i < arr.length ;i++){
         * sum_of_div += Math.ceil((double)arr[i] / (double)(d)) ;
         * }
         * if(sum_of_div <= limit){
         * return d ;
         * }
         * } // time complexity : O(max(arr) * N) ;
         * 
         * 
         * return 0;
         */

    }
}
