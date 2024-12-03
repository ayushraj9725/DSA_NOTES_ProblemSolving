public class MaximumSubarray1 {
    public static long maxSubarraySum(int[] arr, int n) {
        /*	// Brute Force Approach
            int maxi = 0 ;
            for(int i = 0 ; i < n ;i++){
                for(int j = i ; j < n ;j++){
                    int sum = 0 ;
                    for(int k = i; k <= j ; k++){
                        sum =sum + arr[k];
                        
                    }
                     maxi = Math.max(maxi,sum);
                }
            }
    
            return maxi ;
            // this is taking O(N^3) time that is very poor
            //space not used O(1) , 
        */
    
    
    
    
              // better force approach
    
    /*
               int maxi = 0 ;
               for(int i = 0 ; i < n ;i++){
                   int sum = 0 ;
                   for(int j = i ; j < n ;j++){
    
                        sum = sum + arr[j];
                        maxi = Math.max(maxi,sum);
                   }
               }
               return maxi ;
               // this is taking O(N^2) time not good it also
               // space complexity : O(1)
    
      */
    
    
       // Let's Optimized it using Kadane's Algorithms 
    
           long maxi = Integer.MIN_VALUE ;
           long sum = 0 ;
           for(int i = 0 ; i < n ; i++){
               sum = sum + arr[i];
    
               maxi = Math.max(maxi,sum);
               
               if(sum < 0){
                   sum = 0 ;
               }
           }
           if(maxi < 0) return 0 ;
    
           return maxi ;
    
           // using this algo we able to find the maxi sum of subarry
           // time complexity taken : O(N) and space O(1)
    
    
    
    
    
    
    
    
        }
}
