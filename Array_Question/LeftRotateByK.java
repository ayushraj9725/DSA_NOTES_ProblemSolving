import java.util.ArrayList;

public class LeftRotateByK {
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
}
