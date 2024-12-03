public class RotateMatrix {
    public static void rotateMatrix(int [][]mat){
        /*    // Brute force approach 
            // we are taking a matrix for storing element at the correct place
            int n = mat.length ;
            int m = mat[0].length ;
    
            int result[][] = new int[n][m];
    
            for(int i = 0 ; i < n ;i++){
                for(int j = 0 ; j < m ; j++){
                    result[j][n-1-i] = mat[i][j];
                }
            }
           // return result ; 
        // here in the question not allow to used another matrix for doing this so it is not giving correct answer
    */
    
    
          // Optimal Approach 
          int n = mat.length ; // matrix given square so length will same of both row and colm
          for(int i = 0 ; i < n ; i++){
              for(int j = i ; j < n ; j++){  // tranposing matrix taking O(n*m) time 
                  int temp = mat[i][j];
                  mat[i][j] = mat[j][i];
                  mat[j][i] = temp ;
              }
          }
          // now reverseing all the rows in the transposed matrix
          for(int i = 0 ; i < n ; i++){
              int x = 0 , y = n - 1 ;
              while(x < y){
                  int temp = mat[i][x];
                  mat[i][x] = mat[i][y];
                  mat[i][y] = temp ;
                  x++ ;
                  y-- ;
              }
          } 
    
       // O(n^2) time used here for both operation and space O(1) in constant
    
    
    
    
    
    
    
        
        }
}
