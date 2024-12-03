public class SetMatrixZeros2 {
     /* public void makeRow(int[][] a , int n ,int m ,int i){
        // making row 1 into -1 , j change for i same so running j loop
        for(int j = 0 ; j < m ;j++){
           if(a[i][j] != 0){
              a[i][j] = -1 ;
           }
        }
    }
    public void makeColm(int[][] a , int n ,int m ,int j){
        // making column 1 into -1 , i change for ijsame so running i loop
        for(int i = 0 ; i < n ;i++){
           if(a[i][j] != 0){
              a[i][j] = -1 ;
           }
        }
   */ 
  public void setZeroes(int[][] matrix) {
    /*    // brute force Approach 
        int n = matrix.length ;
        int m = matrix[0].length;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    makeRow(matrix , n,m,i);
                    makeColm(matrix ,n,m,j);
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0 ;
                }
            }
        }
        // time complexity O(n*m) * O(n+m) + O(n*m) .

        */



        //Better Approach
         
      /*   int n = matrix.length ;
         int m = matrix[0].length ; 
         int row[] = new int[n];
         int colm[] = new int[m];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1 ; // marking row arry 1 bcz i runs for row
                    colm[j] = 1 ; //marking colm ary 1 bcz j runs for column
                }
            }
        }
        // reiterating the matrix and mark the matrix 0

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(row[i] == 1 || colm[j] == 1){
                    matrix[i][j] = 0 ;
                }
            }
        }
      
    }
    }
        
        // time taken O(n*m) + O(n*m) space taking 2 array row and colm size  space
    */    

        // Optimal Approach 

         // instead of taking 2 array row and colm for marking , use that type in matrix[0][..] for colm and matrix[..][0] for row
         int n = matrix.length ;
         int m = matrix[0].length ; 
         int col = 1 ;
         for(int i = 0 ; i < n ; i++){
               for(int j = 0 ; j < m ; j++){
                   if(matrix[i][j] == 0){
                    // mark col with zero for i  
                       matrix[i][0] = 0 ; //
                       // marking row with j varing
                       if(j != 0){
                        matrix[0][j] = 0 ;
                       }
                       else col = 0 ;
                   }
               }
         }
         // now reiterating the matrix from next ,excepting marked 
         for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ;j++){
                // 
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0 ;
                    }
                }
            }
         }
         // at first we check for row marking of matrix and it depend upon colm markd
         if(matrix[0][0] == 0) {
              for(int j = 0 ; j < m ; j++) matrix[0][j] = 0 ;
         } 
         if(col == 0){
              for(int i = 0 ; i < n ; i++) matrix[i][0] = 0 ;
         }
        }
}
