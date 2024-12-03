// import java.util.ArrayList;
// import java.util.List;

public class MedianInMatrix {

    /* 
     // Brute Force Solution : 
  // steps 1. take a list and fill all the items O(n*m) time and O(n *m) space taking
    // 2. sort the list  ,at sorting time O(n*m log(n*m)) time taken 
    // at the end return l[n *m / 2] ;
    List<Integer> l = new ArrayList<>();
    for(int i = 0 ; i < R ; i++){
        for(int j = 0 ; j < C ;j++){
            l.add(matrix[i][j]);
        }
    }
    Collections.sort(l); //sort the list 
    
    // now return the required thing median
    
    return l.get(R * C/2) ;

 */



// this is optimal solution : time taken  O(log2(n*m) * n * log2m)

    static int upperBound(int[] arr ,int x, int n){ // we are optimizing to check smaller or equal than mid ,x using binary seaarch for every row
        int i = 0 , j = n - 1 ;
        int ans = n ;
        while(i <= j){
          int md = (i+j)/2 ;
          if(arr[md] > x){
                ans = md ;
                j = md - 1 ;
           }
           else i = md + 1 ;
        }
      
        return ans ; // return here index of upper bound that mean that numbers are smaller equal to x
    }
    static int countSmall(int[][] matrix, int m, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += upperBound(matrix[i], x, n); // using upperbound we can find how many smallEqual element present in matrix than check to req
        }
        return cnt;
    }
    int median(int matrix[][], int R, int C) {
        
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < R ;i++){
            min = Math.min(min,matrix[i][0]); // bcz every row are sorted so at first colm definiatly has minimum
            max = Math.max(max,matrix[i][C-1]); // and just like that maximum at last colm
        }
        // once we done this start for counting and binary search
        int req = (R * C) / 2 ;
        while(min <= max){
            int mid = (min + max) / 2 ;
            int smallEql = countSmall(matrix,R,C,mid); // how we count using this 
            if(smallEql <= req) min = mid + 1;
            else max = mid - 1 ;
        }
        return min ; // at the end return min / low because hold median at last of binary search
        
        
        
    }
}
