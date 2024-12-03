import java.util.HashMap;

public class LongestSubArryMaxBrute {
     public static int longestSubarrayWithSumK(int []a, long k) {
        // Brute Force approachs
// generate all the possible subsarray and check each sum 
//is equal to k or not if yes then find the length of that subarray and return
             
 /*            int lengthh = 0 ;
  for(int x = 0 ; x < a.length ;x++){
      for(int y = x ; y < a.length ;y++){
                int sum = 0 ;
                for(int z = x ; z < y ; z++){
                    sum = sum + a[z] ; // finding the subarray sum if the sum found equal to k then
                }
                if(sum == k) {
                     lengthh = Math.max(lengthh, y - x);
                }
           }
        }
        return lengthh ;

        // time complexity is near to O(N^3) because y and z are 
        // reducing iteration by iteration 
        // space complexity will O(1),bcz space not used 


    // i can reduce litter in brute that is not need to find again and again sum for extra loop z iterating 

    */ // most brute force reduced 
/*
        int l = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            int sum = 0 ;
            for(int j = i ; j < a.length ; j++){
                sum = sum + a[j];
                if(sum == k){
                    l = Math.max(l,j-i+1);
                }
                 // j- i means simple math ,it new length of subarray
            }
        }
        return l ;

   // here time complexity reduced O(N) bcz we are not doing extra loop for calculating sum agian and again
*/

   //  better solution buut not , using hashing and prefix sum pattern
    HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int cumulativeSum = 0;
        
        // Traverse the array
        for (int i = 0; i < a.length; i++) {
            cumulativeSum += a[i];
            
            // If cumulative sum equals K, update maxLength
            if (cumulativeSum == k) {
                maxLength = i + 1;
            }
            
            // Check if (cumulativeSum - K) exists in the map
            if (map.containsKey(cumulativeSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(cumulativeSum - k));
            }
            
            // Store cumulative sum in map if it doesn't already exist
            if (!map.containsKey(cumulativeSum)) {
                map.put(cumulativeSum, i);
            }
        }
        
        return maxLength;

/// this will not work for positive element having so we have to use different approach instead of this
// but this is optimal made in case of having positive and negative element in the array



    }
}
