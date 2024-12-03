public class LeftRotateByK2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k % n ; // Handle cases where k is larger than array length
        k = n - k ;
        // Step 1: Reverse the first k elements
        reverse(nums, 0, k - 1); // use time O(k)

        // Step 2: Reverse the remaining elements
        reverse(nums, k, n - 1);  // use time O(n-k)

        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);  // use time O(k)
    }     //over all O(2n) and space O(1) so it is optimal 

    // Helper function to reverse part of an array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    /*
    // brute force is this 
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
         int n = arr.size();
         k = k % n ;
       ArrayList<Integer> temp = new ArrayList<>();
         for(int i = 0 ; i < k ;i++){
             temp.add(arr.get(i));
         }
         for(int i = k ; i < n ;i++){
             arr.set(i-k ,arr.get(i));
         }

         for(int i = 0 ; i < k ;i++){
             arr.set((n-k+i),temp.get(i));
         }

         return arr ;
         // O(k) + O(n-k) + O(k) time taken and space O(k)
    }
     */
     // other approaches is this using arrays and collections
}
