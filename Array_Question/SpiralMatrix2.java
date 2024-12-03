import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ; // taking the size variable
        int left = 0 , right = m - 1 , top = 0 , bottom = n - 1 ; // taking here the direction

        ArrayList<Integer> result = new ArrayList<>();
        while(left <= right && top <= bottom){
        // move into the right direction
        for(int i = left ; i <= right ; i++){
               result.add(matrix[top][i]);
           }
           top++ ; // move top to next
        //move into the bottom direction
        for(int i = top ; i <= bottom ;i++){
               result.add(matrix[i][right]);
        }
           right-- ; // right move back
        //moving into left direction
        if(top <= bottom){
            for(int i = right ; i >= left ;i--){
                result.add(matrix[bottom][i]);
            }
           bottom-- ; //bottom move towards top
          }
        if(left <= right){
            for(int i = bottom ; i >= top ;i--){
                result.add(matrix[i][left]);
            }
           left++ ;
          }
        }

        return result ; // time taken O(n*m) and space O(n*m) for only returning 
    }
}
