public class NextPermutation1 {
    public static void reverse(int[] nums, int i , int j){
        while(i < j){
            int temp = nums[i] ;
            nums[i] = nums[j] ;
            nums[j] = temp ;
            i++ ;
            j-- ;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length ;
        int index = -1 ;
        for(int i = n -2 ;i >= 0 ;i--){ // 1st step finding that index where the turning index from greater
            if(nums[i] < nums[i+1]){
                index= i ;
                break ;
            }
        }
        if(index == -1 ) {
            reverse(nums,0,n-1);
            return  ;
        }
        for(int i = n-1 ; i >= 0; i--){ // 2nd step here find the sligth greater than nums[index]
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] =temp ;
                break ;
            }
        }
        reverse(nums,index+1,n-1) ; // here the 3 step remaining elements in sorted
        // over all time complexity will be in the worth case O(N + N +N) and space will O(1) 
    }
}
