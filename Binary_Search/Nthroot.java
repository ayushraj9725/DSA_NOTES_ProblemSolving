public class Nthroot {
    /*
     * public static long power(int i , int n){
     * long pw = 1 ; // this power calculating can overflow in case of bigger value
     * so we not use
     * while(n > 0){
     * if(n % 2 == 1){ // if n is odd do multiply with i and decrement n by one
     * pw = pw * i ;
     * n = n - 1 ;
     * }
     * else{ // but if n is even do multiply with power, and made i in power
     * i = i * i ;
     * n = n/2 ; // and decrement n divide by 2 to optimize
     * }
     * } // once n get at 0 go out of loop and return ans
     * return pw ;
     * }
     */

    // we check linearly and where we get ans > m one bye one doing quit not check
    // for more calculation and update ans
    public static int power(int i, int n, int m) {
        long ans = 1;
        for (int j = 1; j <= n; j++) {
            ans = ans * i; // one by one calculating
            if (ans > m)
                return 2;

        }
        if (ans == m)
            return 1;
        return 0;
    }

    public static int NthRoot(int n, int m) {
        // optimized Solution : using binary search ;
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (power(mid, n, m) == 1)
                return mid; // if get equal just return the mid
            else if (power(mid, n, m) == 0) {
                low = mid + 1; // left eliminated checking for max
            } else
                high = mid - 1; // trim high not need to check for bigger
        }
        // once it not done then return -1
        return -1;
        // time complexity : O(log2m * log2n) ; most optimal

        /*
         * // Brute force method is to use initially Linear one by one check
         * for(int i = 1 ; i < m ; i++){
         * if(power(i,n) == m){
         * return i ;
         * }
         * else if(power(i,n) > m) break ;
         * //if any chance get greater of power quit not check for other
         * }
         * 
         * return -1 ;
         * // time complexity : O(m*n) extremlly brute force while we are using both for
         * linear operation
         * // most Brute for : O(m*log2n) internally for calculating power , using
         * exponential power way for calculating n
         * 
         * 
         */
    }
}