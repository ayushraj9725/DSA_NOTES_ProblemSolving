public class singleNumber1 {
    public int singleNumber(int[] nums) {
        int result = 0 ;
       for(int i : nums){
           result = result ^ i ;
       }
       return result ;
       /*
       Time Complexity: O(n), where n is the number of elements in the array. 
       You need to go through each element once.
       Space Complexity: O(1), as no extra space is used beyond a single integer. */
    }
}