public class KokoEatBananas {
    public static int Maxi(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int FindTotalHours(int v[], int hr) {
        int n = v.length;
        int Totalhrs = 0;
        // finding total hr ,as round value up to the nearest integer.
        for (int i = 0; i < n; i++) {
            Totalhrs += Math.ceil((double) (v[i]) / (double) (hr));
        }
        return Totalhrs;
    }

    public static int minimumRateToEatBananas(int[] v, int h) {

        // optimization : using binary search
        int ans = 0;
        int i = 0, j = Maxi(v); // i is low and j is high where i am appling the binary search
        while (i <= j) {
            int mid = (i + (j - i) / 2);
            int reqTime = FindTotalHours(v, mid);
            if (reqTime <= h) {
                ans = mid;
                j = mid - 1;
                // if we found check for minimum so eliminate right half
            } else
                i = mid + 1; // otherwise left half
        }

        return ans; // we can also return her low as an answer , bcz at the end of the binary search
        // low which is initially not possible at at last till will hold the answer .
        // time complexity : O(log2(max(v)) * n)

        /*
         * // Brute force Solution : Using linear Search
         * // forst we need to define the range for the last ,bcz 1 is 1st and what is
         * last so max is last
         * 
         * int j = Maxi(v); // this j is our last or high whatever ;
         * 
         * // now we have to check for the minimum require time in per hr , so use ceil
         * to do it
         * for(int i = 1 ; i <= j ;i++){ // here we are iterating v for eating banana
         * int reqTime = FindTotalHours(v,i) ; // v has bananes and i will become our
         * minimum per hrs eat banana by koko
         * if(reqTime <= h){
         * return i ; // this is mini per hours eat banana total v has
         * }
         * }
         * return -1 ;
         * 
         * // Here time complexity : O(Max(v) * n) , here we are observing the pattern
         * of linearly iterating and see two result ,
         * // so we can optimized it using binary search the will mehtion above in this
         * code
         * 
         */

    }
}
