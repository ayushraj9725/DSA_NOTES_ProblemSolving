public class Upper_Bound {
    public static int upperBound(int []arr, int x, int n){
        // Upper Bound
        int i = 0 , j = n - 1 ;
        int ans = n ;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] > x){
                ans = mid ;
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return ans ;
    }// time complexity = O(log2n) Binary search 
}
