public class countFirstLastOccure {
    public static int first(int a[] , int n , int x){
        int i = 0 , j = n - 1 ;
        int first = -1 ;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            if(a[mid] == x){
                first = mid ;
                j = mid - 1 ;
            }
            else if(a[mid] < x){
                i = mid + 1 ;
            }
            else j = mid - 1 ;
        }
        return first ;
    }
    public static int last(int a[] , int n , int x){
        int i = 0 , j = n - 1 ;
        int last = -1 ;
        while(i <= j){
            int mid = i + (j - i)/2 ;
            if(a[mid] == x){
                last = mid ;
                i = mid + 1 ;
            }
            else if(a[mid] < x){
                i = mid + 1 ;
            }
            else j = mid - 1 ;
        }
        return last ;
    }
    public static int[] findFirstLast(int a[],int n, int x){
        int first = first(a,n,x);
        if(first == -1) return new int[]{-1,-1};
        return new int[]{first,last(a,n,x)} ;
    }
    public static int count(int arr[], int n, int x) {
        //counting this by calling that first and last function and just return that size 

        int[] ans = findFirstLast(arr,n,x);
        if(ans[0] == -1) return 0 ;
        return ans[1] - ans[0] + 1 ;
       
    }
}
