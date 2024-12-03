public class ceilthefloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int low = 0, high = n - 1;
        int floor = -1, ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                floor = a[mid];
                ceil = a[mid];
                break;
            } else if (a[mid] > x) {
                ceil = a[mid];
                high = mid - 1;
            } else {
                floor = a[mid];
                low = mid + 1;
            }
        }

        return new int[] { floor, ceil };
        // time complexity : O(log2n)Binary Search Technique
    }
}
