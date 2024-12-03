import java.util.HashMap;

public class Count_subarray_sum1 {
    public int subarraySum(int[] nums, int k) {
        // optimal way using prefix sum 
        int n = nums.length ;
        int count = 0 ;
        int prefix_sum = 0 ;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i = 0 ; i < n ;i++){
            prefix_sum = prefix_sum + nums[i];

            int remove = prefix_sum - k ;

            count = count + hm.getOrDefault(remove,0);

            hm.put(prefix_sum , hm.getOrDefault(prefix_sum,0)+1);
        }
        
        return count ;
        // time complexity is O(N) in case of java but in c++ thay can be O(n) and O(nlogn)
        // space complexity will O(N) , because map using n extra space 
         }
}
