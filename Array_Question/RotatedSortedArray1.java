public class RotatedSortedArray1 {
    public int findMin(int[] nums) {
        int i = 0 ;
        int j = nums.length - 1 ;
        // checking that case which already sorted 
        if(nums[i] < nums[j])  return nums[i] ;

        while(i < j){
            int mid = i + (j - i)/2 ;
            if(nums[mid] > nums[j]){
                i = mid + 1 ;
            }
            else j = mid ;
        }
        return nums[i] ;
        
      // time complexity is O(log n) this is Binary Search Approach  







// this is not correct above written that is correct .
        // while(nums[i] > nums[j]){
        //     count++ ;
        //     i++ ;
        //     j-- ;
        // }
        // result = nums[j+1] ;

        // return result ;
    }
}
