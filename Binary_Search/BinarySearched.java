public class BinarySearched {
    public static int BinarySearch(int nums[] ,int low,int high,int target ){
        if(low > high) return -1 ;
        int mid = low + (high - low)/2 ;
        if(nums[mid] == target) return mid ;
        if(nums[mid] < target) return BinarySearch(nums , low , mid-1 , target) ;
         return BinarySearch(nums , mid+1 , high , target);
    }
    public static int search(int []nums, int target) {
       
        // Recursive approach .
        
        return BinarySearch(nums ,0, nums.length - 1 ,target);
       
       // Time Complexity : O(log2n) nealy bcz always dividing here element by 2 .
       //  in every calling of function .
       
       
    }
}   
       
       
       
       
       
       
       
       
    /*   // Binary Search approach
       
        int i = 0 ;
        int j = nums.length - 1 ;

        while(j>=i){
            int mid = i + (j - i)/2 ;
            if(nums[mid] == target){
                return mid ;
            }
            if(nums[mid] < target){
                i = mid + 1 ;
            }
            else{
                j = mid -1 ;
            }
        }
        return -1 ;
      // time complexity takes O(log2n) and space O(1) .
        
   */