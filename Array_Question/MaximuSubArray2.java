public class MaximuSubArray2 {
    public int maxSubArray(int[] nums) {
        /*       // Brute force method 
                int maxi = 0 ;
               for(int i = 0 ; i < nums.length ;i++){
                   for(int j = 0 ; j < nums.length ; j++){
                       int sum = 0;
                       for(int k = i ; k <= j ;k++){
                           sum = sum + nums[k];
                       }
                       maxi = Math.max(sum,maxi);
                   }
               }
               return maxi ;
               // this is taking O(N^3) time for compiling and executing.
               // not any extra space used here 
       */
       
       
       
               // better Solution \
       /*
                  long maxi = Long.MIN_VALUE ;
               for(int i = 0 ; i < nums.length ; i++){
                   long sum = 0 ;
                   for(int j = i ; j < nums.length ; j++){
                        sum += nums[j] ;
                        maxi = Math.max(maxi,sum);
                   }
                   
               }
               return maxi ;
       
               */
       
               // most optimal approach  using Kadan's Algorithms 
       
               int maxi = Integer.MIN_VALUE ;
               int currentSum = 0 ;
               for(int i = 0 ; i < nums.length ;i++){
                   currentSum += nums[i] ;
       
                   if(currentSum > maxi) {  // we can use also Math.max(currentSum , maxi)
                       maxi = currentSum ;
                   }
                   if(currentSum < 0){
                       currentSum = 0 ;
                   }
               }
             
               return maxi ;
       
               // time used here O(N) and space used O(1) .
           }
}
