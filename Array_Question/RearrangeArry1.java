public class RearrangeArry1 {
    public int[] rearrangeArray(int nums[]){
        // otimal solution
   
        int eindex = 0 ;
        int oindex = 1 ;
        int result[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++){
           if(nums[i] > 0){
               result[eindex] = nums[i];
               eindex += 2 ;
           }
           else{
               result[oindex] = nums[i];
               oindex += 2 ;
           }
        }
         return result ;
   
         // overall time complexity will we O(N) and space using for returning the result
         // so not considering this so O(1)
      }
    
}
