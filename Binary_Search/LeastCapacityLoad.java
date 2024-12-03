public class LeastCapacityLoad {
    public static int PossibleCap(int w[], int cap) {
        int day = 1, load = 0;
        for (int i = 0; i < w.length; i++) {
            if (load + w[i] > cap) { // checking if capacity exceeding on particular cap so update the day and load
                day = day + 1;
                load = w[i];
            } else
                load = load + w[i]; // adding and update the load capacity
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, weights[i]); // finding 1st weight cap at minimum so that every thing able to loaded
            high = high + weights[i]; // finding last bound that is sum of arra
        }
        // low has max value and high has summation ,
        // Optimal Solution : where we are triming the capacity between low and high
        // using binary search
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int dayReq = PossibleCap(weights, mid); // mid is showing capacity
            if (dayReq <= days) {
                ans = mid;
                high = mid - 1; // triming here reight if we get , we need least capacity with in days given
            } else
                low = mid + 1;
        }
        return ans; // we can also return here low bcz at the end of the while loop it will be
                    // pointing the answer that is least , bcz of opposite polarity ;

    }
}
