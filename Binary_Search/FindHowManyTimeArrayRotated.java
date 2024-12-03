public class FindHowManyTimeArrayRotated {
    public static int findKRotation(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int mini = Integer.MAX_VALUE, ans_ind = -1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[i] < arr[j]) {
                if (arr[i] < mini) {
                    ans_ind = i;
                    mini = arr[i];
                }
                break;
            }
            if (arr[i] <= arr[mid]) {
                if (arr[i] < mini) {
                    ans_ind = i;
                    mini = arr[i];
                }
                i = mid + 1; // removing left half
            } else {
                if (mini > arr[mid]) {
                    ans_ind = mid;
                    mini = arr[mid];
                }
                j = mid - 1; // removing right half
            }
        }
        return ans_ind;

        /*
         * // to find this we have to know the index at which the arry containing
         * minimest
         * // so how i can do this , using binary search and sorted property
         * int n = arr.length ;
         * int i = 0 , j = n - 1 ;
         * if(arr[i] < arr[j]) return i ; // here we check the array sorted
         * 
         * while(i < j){
         * int mid = (i + j) / 2 ;
         * if(arr[j] < arr[mid]){ // here always we check for unsorted elemnt
         * i = mid + 1 ; // eliminate left
         * }
         * else{
         * j = mid ; // eliminate right not include mid
         * }
         * }
         * return i ;
         * //
         */
    }
}
