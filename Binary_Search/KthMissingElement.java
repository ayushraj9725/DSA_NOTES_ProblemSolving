public class KthMissingElement {
    public static int missingK(int[] vec, int n, int k) {
        // Optimal Approch :
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1); // that is actually doing we idealy what should be number at particular
                                                // index or mid , so we are doing index+1 /mid+1
            if (missing < k) { // missing number before any particular number if we get trim the left
                low = mid + 1;
            } else
                high = mid - 1; // other wise trim the right part
        } // after the end of the loop by opposite polarity get that 1st number that is at
          // high , and 2nd will at low
          // that two number we are looking for that we get at the end of the loop ,and
          // between these both my missing kth element /number definatly present
          // where high pointing there we check what missing before this ,that mean how
          // many numbers missing before this number which is pointing by high
          // that is how we find vec[high] + k - missing , and missing is what here
          // vec[high] - high + 1 , and k - missing is more ,when we add up into vec[high]
          // at the end we get the answer
          // but is will not work for the arry [4,6,8] k = 3 ,but this time high is -ve so
          // actually vec[high] + more is not working
          // so this time we have to find the formula , missing value put into this
          // vec[high] + k - missing
          // vec[high] + k - (vec[high] - (high + 1))
          // vec[high] + k - vec[high] + (high + 1) so both vec[high] is cencile out
          // rest part is high + 1 + k is to return here
          // actually see where is high and low [high,low] so high + 1 is actually low ,so
          // we return low+k
        return low + k;

        /*
         * // Brute Force using this Logic if any number while iterating arr get lesser
         * than k that time
         * // we can think , missing should next forward or ahead so looking for next so
         * update the k by one
         * for(int i = 0 ; i < n ; i++){
         * if(k >= vec[i]) k++ ;
         * else break ;
         * }
         * return k ;
         * 
         * // at which time we are exceeding the number iterating in arry comparing k
         * // that time , that kth value is answer .
         * // time complexity : O(N) space not used any extra
         */




         
        /*
         * // Brute Force Approach : Using HashMap
         * // Step 1: Populate the HashMap with elements in the array
         * HashMap<Integer, Boolean> map = new HashMap<>();
         * for (int num : vec) {
         * map.put(num, true);
         * }
         * 
         * // Step 2: Find the kth missing number
         * int missingCount = 0;
         * int current = 1; // Start from the smallest positive integer
         * 
         * while (missingCount < k) {
         * // If the current number is not in the HashMap, it is missing
         * if (!map.containsKey(current)) {
         * missingCount++;
         * // If we've reached the kth missing number, return it
         * if (missingCount == k) {
         * return current;
         * }
         * }
         * current++;
         * }
         * 
         * // If we don't find it in the loop (unlikely due to while condition), return
         * -1
         * return -1;
         * // time complexity : O(N + M) where N is length of arr and M is max that
         * number till where we reach for finding missing number
         * // space complexity : O(N)
         * 
         */

    }
}
