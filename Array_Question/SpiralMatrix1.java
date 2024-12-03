public class SpiralMatrix1 {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // there is one Solution that is optimal 
        int n = MATRIX.length ;
        int m = MATRIX[0].length ;
        int left = 0 , right = m - 1 ;
        int top = 0 , bottom = n - 1 ;
        // tkaing an array for return result 
        int result[] = new int[n*m]; // because array size should be size of matrix 

        // iterating rigth dirextion
        int j = 0 ; // taking for index 

      while(left <= right && top <= bottom) {

        for(int i = left ; i <= right ; i++){
               result[j] = MATRIX[top][i];
               j++ ; 
        }
        top++ ;
        // iterating the bottom direction 
        for(int i = top ; i <= bottom ; i++){
              result[j] = MATRIX[i][right];
              j++ ;
        }
        right-- ;
        // iterating the left direction
        if(top <= bottom){
          for(int i = right ; i >= left ; i--){
              result[j] = MATRIX[bottom][i];
              j++ ;
          }
          bottom-- ;
        } 
        // iterating the Top Direction 
        if(left <= right){
          for(int i = bottom ; i >= top ; i--){
              result[j] = MATRIX[i][left];
              j++ ;
          }
          left++ ;
        }
      }

        return result ;   // time taken O(n*m) but space only taken for return value not for execution
    }
}
