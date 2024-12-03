public class movedZeros2 {
    public static int[] check(int nums[]){
        int n = nums.length ;
       int j = -1 ; //                                                         to avoid the indexoutofbaound we fix 0 ,otherwise here shoud be -1 in return case and we have to return after this for loop execution if(j ==-1) return a ;
      for(int i = 0 ; i < n ; i++){ // O(x) time taken
          if(nums[i] == 0){
              j = i ;
              break;
          }
      }
      if(j == -1 ) return nums ; // return that given arr if any 0 not found 
      for(int i = j+1 ;i < n  ;i++){  // O(n-x) time taken
          if(nums[i] != 0){
              int temp = nums[i];
              nums[i] = nums[j] ;
              nums[j] = temp ;
              j++ ;
          }
      } 
      return nums ; // over all time takne O(n) and space O(1)
   }
   public void moveZeroes(int[] nums) {
       check(nums) ;
   }
}
