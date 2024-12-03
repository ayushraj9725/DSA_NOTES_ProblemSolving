import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(); // using Set so n space using 

        for(int i = 0 ; i < nums.length ;i++){
            set.add(nums[i]);  
        }

        if(nums.length == set.size()){
            return false ;
        }

        return true ;   // O(n) time and space complexity  
    }   // we can also use here hashmap to check containsKey 
}