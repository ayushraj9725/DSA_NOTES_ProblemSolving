import java.util.*;
public class PascalTriangle3 {
    public static int nCr(int n , int r){
        long ans = 1 ;
        for(int i = 0 ; i < r ;i++){
             ans = ans * (n - i);
             ans = ans/(i+1);
        }
        return (int)ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =  new ArrayList<>();

        for(int i = 1 ; i <= numRows ;i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 1 ; j <= i ;j++){
                ans.add(nCr(i - 1 , j - 1));
            }
            result.add(ans);
        }
        return result ;
        /**
        Time Complexity: O(n2), where n = number of rows(given).
Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.

Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).
         */
    }
}
