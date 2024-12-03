public class RowwithMaxione2 {
    // this question can not solved by binary search because it is not sorted .
    public int[] rowAndMaximumOnes(int[][] mat) {

        // Brute Force Solution .
        int ind = -1, max = -1; // it hold the max time appeares ans ind hold which row
        for (int i = 0; i < mat.length; i++) {
            int countRow = 0;
            for (int j = 0; j < mat[0].length; j++) {
                countRow += mat[i][j]; // we are counting using 0,1 addition being in matrix
            }
            // here we are update the max if countRow goes greater than max and hold that
            // particular index in ind variable
            if (countRow > max) {
                max = countRow;
                ind = i; // stored there the row which have maximum one's
            }
        }
        return new int[] { ind, max }; // returning here the row with maxi apprears one's
        // time complexity : O(N * M) using nested loop ;

    }
}
