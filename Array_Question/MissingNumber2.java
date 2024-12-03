public class MissingNumber2 {
    public int missingNumber(int[] nums) {
        /*   int n = nums.length  ; // size of array 
           // we calculating the toatal sum from o to n 
     
           int nsum = (n * (n + 1))/2 ;
           // calculate the total sum of array nums 
           int asum = 0 ;
           for(int i = 0 ; i< n  ;i++){
             asum = asum + nums[i] ;
           }
           // missing number is 
           int miss_number = nsum - asum ;
     
           return miss_number ;
           */
     
      /*     // 2nd optimal solution used XOR operation
           int n = nums.length ; 
           int xor1 = 0 , xor2 = 0;
           for(int i = 0 ; i <= n ; i++){
             xor1 = xor1 ^ i ;
           }  //this is taking O(n) time 
           for(int i = 0 ; i < nums.length; i++){
             xor2 = xor2 ^ nums[i];
           }  // this is also taking O(n) time
           return xor1 ^ xor2 ;  // overall taken it O(2n) , space not used
           
           // can i reduce it more 2 , or operation done in one loop ,yes 
           
           */
     
     
     
           int n = nums.length ;
           int xor1 = 0 ;
           int xor2 = 0 ;
           for(int i = 0 ; i < nums.length ;i++){
               xor2 = xor2 ^ nums[i];
               xor1 = xor1 ^ (i) ; // this is for numbers
           }  
              xor1 = xor1 ^ n ; // it doing bcz in loop we can reach till exect n so,
              // here the time used only O(n) 
     
             return xor1 ^ xor2 ; 
     
     /*
      * using hashSet also we can find the missing element using do operation add and remove , like add in set all the number from 1 to n in for loop ,and then iterating arry using foreach loop remove all the element from set that is belong from arry


       int n = arr.length + 1;  // Range is from 1 to n+1
        HashSet<Integer> set = new HashSet<>();
        
        // Step 2: Add all numbers from 1 to n+1 into the HashSet
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }
        
        // Step 3: Remove each element of the array from the HashSet using for-each loop
        for (int num : arr) {
            set.remove(num);
        }
        
        // Step 4: The remaining element in the HashSet is the missing number
        return set.iterator().next();
      */
     
         }
}
