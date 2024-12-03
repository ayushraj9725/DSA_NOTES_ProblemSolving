public class largestSubarry {
    public static int countPages(int[] arr, int n, int pages) {
        int countBook = 1, pageStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pageStudent + arr[i] <= pages) {
                pageStudent += arr[i];
            } else {
                countBook++;
                pageStudent = arr[i];
            }
        }
        return countBook;
    }

    public static int findPage(int[] arr, int n, int m) {
        // OPTIMAL SOLUTION : BINARY SEARCH
        if (n < m)
            return -1; // this is the impossible case for distribution of book to student
        int low = 0, high = 0; // lowest minimum bound is the max of arr
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i]; // we get the sum here and it is last possible bound
        }
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cp = countPages(arr, n, mid); // mid is pages
            if (cp <= m) {
                ans = mid;
                high = mid - 1; // we are looking for min but that max so eliminate left half after knowing

            } else
                low = mid + 1; // triming the right half that means answer not found yet
        }
        return ans; // we can return here right also due to opposite polarity of possiblity of yes
                    // or not at the end of the bianry search while loop
    }

    public static int largestSubarraySumMinimized(int[] a, int k) {
        int n = a.length;
        int result = findPage(a, n, k);
        return result;
    }
}
