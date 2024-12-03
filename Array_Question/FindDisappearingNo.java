import java.util.ArrayList;
import java.util.List;

public class FindDisappearingNo {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    /*     List<Integer> l = new ArrayList<>();
         for(int i = 1 ;i <= nums.length ;i++){
            boolean found = false ;
            for(int j= 0 ; j < nums.length ; j++){ // checking presence of i ,
                if(i == nums[j]){
                    found = true ;
                    break ;
                }
            }
            if(!found){
                l.add(i) ;
            }
         }
            
         return l ; // taken O(n*n) time so its brute force 
         // it is not work for large number of element having array .  */

         List<Integer> result = new ArrayList<>();

         for(int i = 0 ; i < nums.length ;i++){  // O(n) time tkaing for marking -ve
            int index = Math.abs(nums[i]) - 1  ;

            if(nums[index] > 0){
                nums[index] = -nums[index] ; //nums[index] = nums[index]*-1
            }
         }
         for(int i = 0 ; i < nums.length ;i++){ // O(n) time taking for checking +ve index
            if(nums[i] > 0){
                result.add(i+1);
            }
         }
         return result ;
    } 
}
