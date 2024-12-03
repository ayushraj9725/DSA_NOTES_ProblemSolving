import java.util.*;
public class TwoSumType2 {
    public int[] twoSum(int[] nums, int target) {
        // brute force method 
        int r[] = new int[2]; // using O(2) space for return the value not extra 
     /*   for(int  i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                      r[0] = i ;
                      r[1] = j ;                }
            }
        }
        return r ;
        // the time complexity will obviously O(N^2) ;
        */

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int c = nums[i] ;  // current element of nums
            int d = target - c ; // difference checking containing in hashmap or not
            if(m.containsKey(d)){
                  r[0] = m.get(d) ;
                  r[1] = i ;
                  break ;
            }
            m.put(nums[i],i); // otherwise putting index correspond to numselement
        }
        return r ;
     // OverAll time and Space complexity is O(N) in worth case 
     
    /*
    // nnot  Optimal Solution  for this scenario
         int i  = 0 , j = nums.length - 1 ;
         Arrays.sort(nums);
         while(i < j){
            if(nums[i] + nums[j] == target){
                r[0] = i ;
                r[1] = j ;
            }
           else if(nums[i] + nums[j] > target){
                j-- ;
            }
           else{
               i++ ;
           }
         }
         return r ;  // actually this will not work for this particular problem because here original index has changed by sorting
         // so the correct approach is above case .using hashmap optimal answer 
         */
    }
}
