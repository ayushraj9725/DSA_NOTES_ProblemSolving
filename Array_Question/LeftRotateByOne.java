class LeftRotateByOne {
    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0] ;
        for(int i = 1 ; i < n ;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp ;

        return arr ; 

        // time complexity - O(n) and space O(1) ;
    }
}