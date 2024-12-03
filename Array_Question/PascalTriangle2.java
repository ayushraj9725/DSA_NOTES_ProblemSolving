import java.util.*;
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        // taking an arrayList to return the result 
        ArrayList<Integer> result = new ArrayList<>();
        long ans = 1 ;
        result.add((int)ans); // adding 1st value that is 1 always 
        for(int i = 1 ; i <= rowIndex ;i++){
              ans = ans * (rowIndex - i + 1);
              ans = ans / i ;
              result.add((int)ans) ;
        }

        return result ;  // return result at the end time complexity will O(N) and space O(1) but here used n extra space for only returning the result 
    }
}
