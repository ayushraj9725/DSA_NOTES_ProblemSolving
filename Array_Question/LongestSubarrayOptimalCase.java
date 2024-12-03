import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayOptimalCase {
    public static int getLongestSubarray(int []nums, int k) {
	       Map<Integer,Integer> prefixSumMap = new HashMap<>(); 
		   int currentSum = 0 ;
		   int maxLength = 0 ;
		   for(int i = 0 ; i < nums.length ; i++){
                currentSum = currentSum + nums[i];

			   // if prefixsum that is current sum will equal to k then update max 
			   if(currentSum == k){
				   maxLength = i + 1 ;
			   }
			   // if currentSum - k  is present then we again update max , bcz that is subarray ,which is equal to sum (max subarray found)
			   if(prefixSumMap.containsKey(currentSum - k)){
				   maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - k)) ;
			   }
			   if(!prefixSumMap.containsKey(currentSum)){
				   prefixSumMap.put(currentSum,i);
			   }
		   }
			   return maxLength ;   // this is taking O(N) time and O(N) space in worth case
			   // this approach will only works for having +ve and -ve eleemnt in array , not for only having +ve ,because it can create problem like space regarding and redundant always will have to update the key by findinf the currentSum
	}
}
