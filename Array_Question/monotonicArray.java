class Solution {
    public boolean isMonotonic(int[] nums) {
        /*
         * int i = 0 , j = nums.length - 1 ;
         * boolean asc = false ;
         * boolean desc = false ;
         * 
         * while(i < j){
         * if(nums[i] <= nums[j]) asc = true ;
         * if(nums[i] >= nums[j]) desc = true ;
         * 
         * i++;
         * j-- ;
         * if(!asc || !desc) return false ; // if any ascending or descending found
         * disorder then false , that mean variable being already ture
         * }
         * 
         * return asc || desc ; // if both of any found monotonic means in order of
         * ascending and descending , after checking the condition at last both found
         * false so
         */
        // above method not woring properly

        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                asc = false;
            if (nums[i] < nums[i - 1])
                desc = false;
        }
        if (!asc && !desc)
            return false;

        return asc || desc;

        // time complexity : O(N) space is not used so O(1) sc

    }
}