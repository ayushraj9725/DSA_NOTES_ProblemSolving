import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        /*        Set<List<Integer>> set = new HashSet<>();
                int n = nums.length ;
                // checking for possible correct triplet ;
        
                for(int i = 0 ; i < n ; i++){
                    for(int j = i+1 ; j < n ; j++){
                        for(int k= j+1 ; k < n ; k++){
                            if(nums[i] + nums[j] + nums[k] == 0){
                                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                                Collections.sort(temp); // temp.sort(null);
                                set.add(temp);
                            }
                        }
                    }
                }
                // stroing into list the set after converting set to list  2D
                List<List<Integer>> ans = new ArrayList<>(set);
                return ans ;
        
                // time complexity : O(N^3 and log(no of unique triplet)) sorting will done in constant , 
                // space used in set O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.
         */
        
                // Better Solution  : using hashing 
        /*
                int n = nums.length ;
                Set<List<Integer>> st = new HashSet<>();
        
                for(int i = 0 ; i < n ; i++){
                    Set<Integer> hs = new HashSet<>();
                    for(int j = i + 1 ; j < n ;j++){
                        int  k = -(nums[i] + nums[j]); // calculating the sum 
        
                        if(hs.contains(k)){ // checking for k is present in the current set or not 
                            List<Integer> tmp = Arrays.asList(nums[i],nums[j],k);
                            Collections.sort(tmp);  // geting for orderd list in result
                            st.add(tmp);  // adding the unique element in the list
                        }
                        hs.add(nums[j]);
                    }
                }
                // adding into the list to returing , converting the list to set
                 List<List<Integer>> ans = new ArrayList<>(st);
                 return ans ;
                // taking O(N^2 and storing for unique element into set ) 
                // space takeing O(N) and O(storing the element into the set)
        
                */
        
              // most optimal Solution : using the Two Pointer Approach ;
        
              int n = nums.length ;
              List<List<Integer>> ans = new ArrayList<>();
              // sorting the array nums
              Arrays.sort(nums);
              for(int i = 0 ; i < n ; i++){
                 if(i > 0 && nums[i] == nums[i-1]) continue ;
                  // takes two pointer
                  int j = i+1 , k = n-1 ;
                  while(j < k){
                    int sum = nums[i] + nums[j] + nums[k] ;
                    if(sum < 0) j++ ;
                    else if(sum > 0) k-- ;
                    else{
                        List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[k]);
                        ans.add(tmp); // no neet to sorted the resuult ,already it will get as sorted 
                        j++ ;
                        k-- ;
                        while(j < k && nums[j] == nums[j-1]) j++;
                        while(j < k && nums[k] == nums[k+1]) k-- ;
                    }
                  }
              }
              return ans ;
        
            /// time complexity will taken for sort (nlogn) and O(N^2 and Storinng into list unique element )
            // space complexity : O(N and storing for return result)
        
            }
}
