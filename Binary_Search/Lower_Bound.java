public class Lower_Bound {
    public static int lowerBound(int []arr, int n, int x) {
        // Lower Bound
        int i = 0 , j = n - 1 ;
        int ans = n ;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            if(arr[mid] >= x){
                ans = mid ;
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return ans ;
    }
}
