public class findFirstLastOccure {
    public static int firstOccure(int []arr ,int n,int k){ // 2nd optimal using Binary direct
        int i = 0 , j = n - 1 , first = -1 ;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            if(arr[mid] == k){
                first = mid ;
                j = mid - 1 ; // search agian in left
            }
            else if(arr[mid] < k) i = mid + 1 ; // go for the right
            else j = mid - 1 ;
        }
        return first ; // once this is return check if first is not occure that mean first is still -1 then no need to call for last
    }
    public static int lastOccure(int arr[], int n, int k){
        int i = 0 , j = n - 1 , last = -1 ;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            if(arr[mid] == k){
                last = mid  ;
                i = mid + 1 ; // if we get then again last so move i toward right skiping left
            }
            else if(arr[mid] > k) j = mid - 1 ;
            else i = mid + 1 ;
        }
        return last ;
    }

    public int[] searchRange(int[] nums, int target) {
        // optimal approach 2 - using binary search
        int n = nums.length ;
        // calling firstOccure
        int first = firstOccure(nums,n,target);
        if(first == -1) return new int[]{-1,-1}; // if first occrence not found simple return {-1.-1} , there is not need to check for last occurence
        int last = lastOccure(nums,n,target);
        return  new int[]{first,last} ; // now return the actual things 









      /*  // Brute force using the Linear Search
        int n = nums.length ;
        int first = -1 , last = -1 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                if(first == -1) first = i;
                last = i ;
            }
        }
        return new int[]{first,last};

        // Time complexity : O(N) linear Search 
        */
        // optimal approach 1 - using lower and upper bound that we write on code ninja .

    }
}
