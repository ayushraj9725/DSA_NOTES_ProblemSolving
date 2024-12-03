import java.util.ArrayList;

public class SearchIn2Darrp2 {
     /*  public static boolean binarySearch(ArrayList<Integer> nums, int target) {
        int n = nums.size(); //size of the array
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) == target) return true;
            else if (target > nums.get(mid)) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr)
    {
       // Better Solution : Binary Search applied in row or colm 
        int n = arr.size();
        int m = arr.get(0).size();

         for (int i = 0; i < n; i++) {
            boolean flag = binarySearch(arr.get(i), x);
            if (flag == true) return true;
        }
        return false;

      // time is taking  : O(n * log2m) time 

   */



      /*  // Brute force Solution : Linear Search 
          int n = arr.size(), m = arr.get(0).size();

        // traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr.get(i).get(j) == x)
                    return true;
            }
        }
        return false;

        // time comp : O(N * M) ;

        */




        // Optimal Solution 
        public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr)
    {
             int n = arr.size();
             int m = arr.get(0).size();
             int low = 0 , high = m - 1 ;
             while(low < n && high >= 0){
                 if(arr.get(low).get(high) == x ) return true ;
                 else if(arr.get(low).get(high) < x) low++;
                 else high-- ;
             }

             return false ;

   // time complexity : O(n + M) abd space O(1) 

   // we can also start with the low left corner 








    }
}
