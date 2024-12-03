import java.util.*;

public class MergeIntervals {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        // at 1st sort the 2d array
        // Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0])); // if ther is list then
        // do Collections.sort(list,(a,b) -> a.get(0) - b.get(0));

        // Arrays.sort(arr,new Comparator<int[]>() {
        // public int compare(int[] a,int[] b){
        // if(a[0] != b[0]) return a[0] - b[0];
        // else return a[1] - b[1] ;
        // }
        // });
        /*
         * // taking a list for return the ans
         * List<List<Integer>> ans = new ArrayList<>();
         * 
         * for(int i = 0 ; i < n ; i++){ // selecting an interval
         * int start = arr[i][0];
         * int end = arr[i][1];
         * // skipping the overlaping intervals
         * if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)) continue ;
         * 
         * // checking the rest of intervals
         * for(int j = i+1 ; j < n ; j++){
         * if(arr[j][0] <= end) {
         * end = Math.max(end,arr[j][1]) ;
         * }
         * else{
         * break ;
         * }
         * }
         * 
         * // and add into the list :
         * ans.add(Arrays.asList(start,end));
         * }
         * 
         * return ans ;
         * 
         * 
         * 
         * // if not understand then watch the tuf striver videos array playlist
         * 
         */

        // Optimal solution : optimizing the O(2N) to O(N)
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
        // overall time complexity : O(nlogn ) + O(n) (sorting and iterating)
        // space complexity : O(n)

    }
}
