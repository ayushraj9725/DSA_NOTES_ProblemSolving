import java.util.ArrayList;

public class SetMatrixZeros1 {
    /* public static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m ,int i){
       // making all 1 to -1 of rows
          for(int j = 0 ; j < m; j++){
                if(matrix.get(i).get(j) != 0){
                    matrix.get(i).set(j,-1);
                }
            } 
              
    }
     public static void markColm(ArrayList<ArrayList<Integer>> matrix, int n, int m ,int j){
        // making all 1 into -1 of column 
            for(int i = 0 ; i < n; i++){
                if(matrix.get(i).get(j) != 0){
                    matrix.get(i).set(j,-1);
                }
            }
     } 

     */
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
      /*   // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
    	for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix.get(i).get(j) == 0){
                    markRow(matrix,n,m,i);
                    markColm(matrix,n,m,j);
                }
            }
        }
         // finally making all -1 to 0
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix.get(i).get(j) == -1){
                   matrix.get(i).set(j,0);
                }
            }
        }
      return matrix ;
      // time complexity (O(n*m)* O(n + m)) + O(n*m)  
      // near about O(N^3) and space is zero 
      */



      // better approach

        // takeing two array row and colomn and , mark them accordingly when we get at what index zero in matrix .
    /*    int row[] = new int[n];
        int colm[] = new int[m];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                if(matrix.get(i).get(j) == 0){
                    row[i] = 1 ;   // marking row using i because i runs for rows
                    colm[j] = 1 ; // marking colm because j runs for colm
                }
            }
        }
        // now reiterating the matrix and seen ro and colm marked value and across that , we have to mark zero in matrix 
        for(int i = 0 ;i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                if(row[i] == 1 || colm[j] == 1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        // now it's ready to return the result 
        return matrix ;

     // time complexity is O(n*m) + O(n*m) so O(N^2) and space using two extra array of row and colomn size

*/    
         

         // optimal solution 

         int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
          return matrix ;
     // time complexity : O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
/// reason: In this approach, we are also traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

  // space are not used so space compl : O(1)

    }
}
