public class PeakElement2 {
    
    public static int findMaxIndex(int[][] mat, int n, int m, int col) {
        int maxValue = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        // Optimal Solution : using Binary search
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int maxRowIndex = findMaxIndex(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1;
            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[] { maxRowIndex, mid };
            } else if (mat[maxRowIndex][mid] < left)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return new int[] { -1, -1 };

        // Optimized the brute force solution
        // find the max from the entire matrix that are going to be the peak possible
        // it is simple in as find the largest element in matrix .
        /*
         * // Extreme brute force : search one by one every element and check
         * int n = mat.length; // Number of rows
         * int m = mat[0].length; // Number of columns
         * 
         * // Traverse through every element in the matrix
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < m; j++) {
         * // Flag to check if the current element is a peak
         * boolean isPeak = true;
         * // Check the top neighbor
         * if (i > 0 && mat[i][j] <= mat[i - 1][j]) {
         * isPeak = false;
         * }
         * // Check the bottom neighbor
         * if (i < n - 1 && mat[i][j] <= mat[i + 1][j]) {
         * isPeak = false;
         * }
         * // Check the left neighbor
         * if (j > 0 && mat[i][j] <= mat[i][j - 1]) {
         * isPeak = false;
         * }
         * // Check the right neighbor
         * if (j < m - 1 && mat[i][j] <= mat[i][j + 1]) {
         * isPeak = false;
         * }
         * 
         * // If it's a peak, return its position
         * if (isPeak) {
         * return new int[]{i, j};
         * }
         * }
         * }
         * return new int[]{-1,-1} ;
         * 
         */
        /*
         * Iterate through all elements:
         * 
         * You iterate over each row (n) and column (m), so the total number of elements
         * is n * m.
         * Check all 4 neighbors for each element:
         * 
         * For each element, you check:
         * Left neighbor (if it exists).
         * Right neighbor (if it exists).
         * Top neighbor (if it exists).
         * Bottom neighbor (if it exists).
         * In the worst case, all 4 neighbors need to be checked for each element,
         * leading to an additional factor of 4
         * 
         * 
         */

        /*
         * int n = mat.length ;
         * int m = mat[0].length ;
         * for(int i = 0 ; i < n ; i++){
         * for(int j = 0 ; j < m ;j++){
         * if(mat[i][j] > mat[i][j-1] && mat[i][j] > mat[i][j+1]
         * && mat[i][j] > mat[i-1][j] && mat[i][j] > mat[i+1][j]){
         * return new int[]{i,j} ;
         * }
         * }
         * }
         * return new int[]{-1,-1} ;
         * // this is going to give the runn time error
         * 
         */
    }
}
