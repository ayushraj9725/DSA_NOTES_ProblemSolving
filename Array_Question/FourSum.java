import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
     public List<List<Integer>> fourSum(int[] nums, int target) {
      /*   // Brute Force Approach 
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0 ;i < n ; i++){
            for(int j = i+1 ; j < n ;j++){
                for(int k = j+1 ;k < n ;k++){
                    for(int l = k+1 ; l < n ; l++){
                        long sum = nums[i] + nums[j] ;
                        sum += nums[k];
                        sum += nums[l];  // we are doing sum like this to maintain int type , save the type casting 
                        if(sum == target){
                            List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(tmp); // tmp.sort(null) ;
                            st.add(tmp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans ; 
        // time complexity : O(N^4) nearly .
        // space complexity : used O(N) use set and no of unique element add

        */
/*
       // Better Approach : Optimized here N^4 to N^3 using HashSet 
       int n = nums.length ;
       Set<List<Integer>> st = new HashSet<>();
       for(int i = 0 ; i < n ; i++){
           for(int j = i+1 ; j < n ;j++){
               Set<Long> hs = new HashSet<>();
              for(int k = j+1 ;k < n; k++){
                   long sum = nums[i] + nums[j];
                   sum += nums[k];
                   long fourth = target - (sum);

                   if(hs.contains(fourth)){
                      List<Integer> tmp = Arrays.asList(nums[i] , nums[j] , nums[k] ,(int)fourth);
                      tmp.sort(null);
                      st.add(tmp); 
                   }
                   hs.add((long)nums[k]);
               }
           }
       }
    List<List<Integer>> ans = new ArrayList<>(st);
    return ans ;
    // time taken : O(N^3 ) and no of unique element storing in tmp and to set 
    // space complexity : O(2* no of unique quadruplets + O(N)) 
  
 */
   
      
      // Optimal Approach : optimaized here extra space using pointers . 
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // sort the given array 
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            for(int j = i+1 ; j < n ; j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue ;
                int k = j+1 , l = n - 1 ; // taken two pointers 
                while(k < l){
                    long sum = nums[i] + nums[j];
                sum += nums[k];
                sum += nums[l];
                if(sum < target) k++ ;
                else if(sum > target) l-- ;
                else{
                    List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                    ans.add(tmp);
                    k++;
                    l-- ;
                    while(k < l && nums[k] == nums[k-1]) k++ ;
                    while(k < l && nums[l] == nums[l+1]) l-- ; 
                }
                }

            }
        }

        return ans ;

    // Time complxity : O(N^3) + O(nlogn) for sort the array 
    // space complexity : O(1) because we not used any extra space for computing code


    }
}
