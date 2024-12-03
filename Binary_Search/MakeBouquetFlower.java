public class MakeBouquetFlower {
    public static int Min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static boolean isPossibleBouquet(int[] arr, int day, int r, int b) {
        int cnt = 0, bouquet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (day >= arr[i])
                cnt++;
            else {
                bouquet += cnt / r; // here we are cheking for the bouquet and adjacent flower criteria using
                                    // counting the consicutive adjacent flower which are bloomed
                cnt = 0; // and now agiain counting from initial for new bouquet
            }
        }
        // this is again check is cnt has something yes then divide and filled into
        // bouquet
        bouquet += cnt / r;
        if (bouquet >= b)
            return true;
        return false;
    }

    public static int roseGarden(int[] arr, int r, int b) {
        // Binary search approach
        int ans = 0;
        int low = Min(arr), high = Max(arr);

        if (r * b > arr.length)
            return -1; // this is impossible case to arrangeing flower into bouquet
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (isPossibleBouquet(arr, mid, r, b)) {
                ans = mid;
                high = mid - 1; // we are looking for minimum so right we hav to trim
            } else
                low = mid + 1; // no not possible so we are triming down here left portion
        }
        return ans; // here we can return the low bcz of opposite polarity or at thr end of the
                    // binary search

        /*
         * // Brute force approach
         * int low = Min(arr) , high = Max(arr) ; // the range of the day where we could
         * see the minimum and maximum flowers bloomed
         * for(int i = low ; i <= high ; i++){
         * if(isPossibleBouquet(arr,i, r, b)) return i ; // ith day return if they
         * follow that
         * }
         * return -1 ;
         * 
         * // time complexity : O(Max(arr) - min(arr) + 1 ) *N
         * 
         */

    }
}
