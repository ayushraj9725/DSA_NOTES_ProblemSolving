public class SqrtOfNumber {
    public static int sqrtN(long N) {

        if (N < 2)
            return (int) N;

        int low = 1;
        int high = (int) N;
        int ans = 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (mid <= (N / mid)) { // not use (mid * mid) here chance to int overflow
                // ans = Math.max(mid,ans);
                ans = mid;
                low = mid + 1; // left eliminating bcz check for maximum
            } else
                high = mid - 1; // right part eliminated
        }

        return ans; // we can return here also high ,bcz high holds alway
                    // at the end of binary search and that number defenately maximum

        /*
         * // brute force to use Math.sqrt(N);
         * // 2nd way : linearly check for numbers from 1
         * int ans = 1 ;
         * for(int i = 1 ; i <= N ;i++){
         * if(i <= N/i){ // here cance to int overflow so use this instead of (i * i <=
         * nN)
         * ans = i ;
         * }
         * else break ;
         * }
         * return ans ;
         * 
         * // time complexity : Near about O(N) .
         * // because of this will checking unnecessary
         */
    }
}
