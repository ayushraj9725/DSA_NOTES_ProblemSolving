public class SearchIn2Darrp1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Most Optimal Solution : using Optimization think hypotheticlly 2d arry in 1d
        // arryand then apply Binary search ;
        // but problem we are facing to find the index actual thats 2D coordinate not 1D
        // thinked index
        int n = matrix.length, m = matrix[0].length; // each row length is m
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int x = mid / m, y = mid % m;
            if (matrix[x][y] == target)
                return true;
            else if (matrix[x][y] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
        // time complexity : O(log2(n*m)) ,used here only

        /*
         * // Optimal Solution : Binary Search Approach
         * for(int i = 0 ; i < matrix.length ;i++){
         * if(matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1]){
         * int ans = Arrays.binarySearch(matrix[i],target);
         * if(ans >= 0) return true ; // bcz bs method return +ve or -ve index so we
         * need to store that somewhere and there after checking
         * }
         * }
         * return false ;
         */

        /*
         * // Brute force Approach : Linear Search
         * 
         * for(int i = 0 ; i < matrix.length ;i++){
         * for(int j = 0 ; j < matrix[0].length ;j++){
         * if(matrix[i][j] == target) return true ;
         * }
         * }
         * return false ;
         * // time complexity : O(N * M) row * colm
         */
    }
}
