public class removeDuplicatefromSortedA {
    /* public static int removeDuplicates(int[] arr,int n) {
       Set<Integer> s = new HashSet<>();

       for(int i = 0 ; i < n ;i++){
           s.add(arr[i]);

       }   // taken O(n) time and space almost consider it  is optimal   
           // but in case of hash collision it will O(n*n) , it is rare chance 

      return s.size(); */

      public static int removeDuplicates(int[] arr,int n) {
        // another way that is absolute optimal
        // two pointer approach O(N) time and O(1) space 
        int i = 0 ;
        for(int j = 1 ; j < n ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j] ;
                i++ ;
            }
        }
         return i+1 ;
    }
}
