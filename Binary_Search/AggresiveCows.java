import java.util.Arrays;

public class AggresiveCows {
    public static boolean isPossible(int[] arr, int dist, int cow) {
        int countCow = 1, lastCow = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastCow >= dist) {
                countCow++;
                lastCow = arr[i];
            }
        }
        if (countCow >= cow)
            return true;
        return false; // or we can return also countCow >= cow
    }

    public static int aggressiveCows(int[] stalls, int k) {
        int result = 0;
        Arrays.sort(stalls);
        int minDis = 1, maxDis = stalls[stalls.length - 1] - stalls[0];
        while (minDis <= maxDis) {
            int mid = minDis + (maxDis - minDis) / 2;
            if (isPossible(stalls, mid, k)) {
                result = mid;
                minDis = mid + 1; // left trimming bcz looking for max
            } else
                maxDis = mid - 1; // otherwise trimming right part
        }
        return result;

        /*
         * // BruteForce Approach : Linary Search
         * Arrays.sort(stalls);
         * int minDis = 1 , maxDis = stalls[stalls.length - 1] - stalls[0] ; // bcs
         * array sorted so 1st element is always min and last is max ,
         * // we have to find max - min so we do that
         * for(int i = minDis ; i <= maxDis ;i++){
         * if(isPossible(stalls,i,k)) continue ;
         * else return i - 1 ;
         * }
         * return maxDis ;
         */

    }
}
