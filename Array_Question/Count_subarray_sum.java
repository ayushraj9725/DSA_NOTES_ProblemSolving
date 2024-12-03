import java.util.HashMap;

public class Count_subarray_sum {
     public static int findAllSubarraysWithGivenSum(int arr[], int s) {
   /*     // Brute Force Approach
        int n = arr.length ;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ;j++){
                int sum = 0 ;
                for(int k = i ; k <= j ; k++){
                    sum = sum + arr[k];
                }
                if(sum == s){
                    count++ ;
                }
            }
        }    
        return count ;
        // Time complexity taken approx : O(N^3) 
        // Space complexity is (1) because there is not used any extra space 
        */

        // Better Approach 
/*
        int n = arr.length ;
        int count = 0 ;
        for(int i = 0 ; i < n ;i++){
            int sum = 0 ;
            for(int j = i ; j < n ; j++){
                sum = sum + arr[j];

                // check here if sum is equal to s or not
                if(sum == s) count++ ;
            }
        }

        return count ;
      
        // time taken only O(N^2) 
        // space here also not used any extra 
*/

        // Optimal Approach : That is Prefix sum and hashmap used 
         
         int n =  arr.length ;
         int count = 0 ;
         HashMap<Integer,Integer> hm = new HashMap<>();
         int current_sum = 0 ;  // current_sum is prefix sum 
         
         hm.put(0,1);
         for(int i = 0 ; i < n ; i++){
             current_sum = current_sum + arr[i];
             
             int remove = current_sum - s ;
             count = count + hm.getOrDefault(remove,0);

             hm.put(current_sum , hm.getOrDefault(current_sum,0)+1);
         }
     
         return count ;
         // time complexity is O(N) in case of java but C++ there can be O(nlogn)
         // space complexity is O(N) , because n space is used for storing value in map















    }
}
