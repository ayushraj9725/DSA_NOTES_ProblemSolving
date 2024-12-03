class LongestSubarrayOptimal {

    public static int longestSubarrayWithSumK(int []a, long k) {
     //Optimized solution using two pointer and greedy approach
       // like sliding window technique
       if(a.length == 0){
        return 0 ;
    }
    int i = 0 , j = 0 ;
    int sum = a[0] ;
    int maxLength = 0 ;
    int n = a.length ;
    while(j < n){

        while(sum > k && i <= j){
            sum = sum - a[i];
            i++ ;
        }
        if(sum == k){
            maxLength = Math.max(maxLength , j - i + 1);
        }
        j++ ;

        if(j < n) sum = sum + a[j] ;

    }
  return maxLength ;

/* time complexity - that is O(2n) ,because here inner 
while loop in not running for each value of j so it is 
considerd as linear approx O(2n) 
and space is not used here so space complexity O(1)
so this is optimized solution for only +ve element present 
in the array  */

    }
}