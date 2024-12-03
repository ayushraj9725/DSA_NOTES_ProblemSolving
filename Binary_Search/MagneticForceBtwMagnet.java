import java.util.Arrays;

public class MagneticForceBtwMagnet {
    public static boolean isPossible(int[] arr, int dist, int m) {
        int count = 1, last = arr[0]; // 1st always we put at 1st place
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
                // if(count == m) return true ;
            }
        }
        return count >= m; // it will return true if this condition is true otherwise false
    }

    public int maxDistance(int[] position, int m) {
        // Optimal Approach : Binary search used
        Arrays.sort(position);
        int result = 0;
        int minDis = 1, maxDis = position[position.length - 1] - position[0];
        while (minDis <= maxDis) {
            int mid = minDis + (maxDis - minDis) / 2;
            if (isPossible(position, mid, m)) {
                result = mid;
                minDis = mid + 1;// we are looking for max dis that is minimum so 1st left trim
            } else
                maxDis = mid - 1; // other wise right triming
        }

        return result;

        /*
         * // This Brute Foce Using Linear Search we are getting time exceeded , so
         * optimal approach we hav to use ,that is Binary Search
         * 
         * // using Linear Search we are checking
         * Arrays.sort(position);
         * int maxInd = position.length - 1 , minInd = 0 ;// array sorted so 1st is mini
         * and last is max
         * int maxDis = position[maxInd] - position[minInd] ; // finding max distance
         * possible where we reach for finding
         * for(int i = 1 ; i <= maxDis ;i++){
         * if(isPossible(position,i,m)){
         * continue ;
         * }else return (i - 1) ; // if where that is not possible distance to fix
         * magnet just previous one is answer
         * }
         * return -1 ;
         * 
         */
    }
}
