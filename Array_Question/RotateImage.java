public class RotateImage {
     /* public static int[][] rotated(int[][] matrix , int n , int m){
    /// this is the brute force method to rotate the matrix by 90* 
        int result[][] = new int[n][m];
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                result[j][n-1-i] = matrix[i][j];
            }
        }
        return result ;
    }// time complexity used here O(n*m) and space aslso O(n*m) that  coomes in O(N2)
    */
    public static void reverseRow(int[] m){
        int i = 0 , j = m.length - 1;
        while(i < j){
            int temp = m[i];
            m[i] = m[j];
            m[j] = temp ;
            i++ ;
            j-- ;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ;
       // rotated(matrix,n,m);

       // Optimal approach without using extra space and use transpose to achive the rotation by 90 degree
       // 1st step transposing the matrix
       for(int i = 0 ; i < n ; i++){
          for(int j = i ; j < m ;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
          }
       }
       // intthe second step reversing the each row of transposed matrix
       for(int i = 0 ; i < n ; i++){
           reverseRow(matrix[i]);
       }
       // time complexity taken here : O(n*m) transposing and O(n*m) for reverseing rows
       // take all comes in O(n2) overall 2O(n2) ;
       // and space is not used here so O(1) space complexity 

       /**
       we can also reverse like this 
       for (int i = 0; i < n; i++) {
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }
        */
    }
}
