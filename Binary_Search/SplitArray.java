public class SplitArray {
    public static int splitingArr(int[] nums, int n, int split) {
        int countArr = 1, maxSum = 0;
        for (int i = 0; i < n; i++) {
            if (maxSum + nums[i] <= split) {
                maxSum = maxSum + nums[i];
            } else {
                countArr++;
                maxSum = nums[i];
            }
        }
        return countArr;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }
        int ans = 0;
        // apply binary search here to find the spiled minimum sum of max
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int reqArr = splitingArr(nums, nums.length, mid); // mid is splitSum btw low and high
            if (reqArr <= k) {
                ans = mid;
                high = mid - 1; // right part triming bcz looking for mini of max
            } else
                low = mid + 1; // other wise trim the left
        }
        return ans;
    }
}
