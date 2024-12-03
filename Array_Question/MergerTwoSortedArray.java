import java.util.*;
public class MergerTwoSortedArray {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Brute Force Method 
      /*  int n = a.length , m = b.length ;
        long c[] = new long[n+m];
        int index = 0;
        int i = 0 , j = 0 ; // i at a 1st index and j at b 1st index 
        while(i < n && j < m){
            if(a[i] <= b[j]){
                c[index] = a[i];
                i++ ;
                index++ ;
            }
            else{
                c[index] = b[j];
                j++;
                index++ ;
            }
        } // once it is done , if any one arr has exhausted then remaining element putting into c
        while(i < n) c[index++] = a[i++];
        while(j < m) c[index++] = b[j++];

        // now again putting element into those array a and b
        int x = 0 , k = 0 ;
        while(x < n){
            a[x++] = c[k++];
        }
        int y = k - n ;
        while(y < m){
            b[y++] = c[k++];
        }
       */
      // time complexity : O(N+M) for storing both after merge into 3rd and O(N+M) again storing into actual place 
      // so ovelall t.c : 2O(N+M)  and space O(N+M)

     
       // Optimal Solution 1 


       int n = a.length , m = b.length ;
       int i = n - 1 ,j = 0 ;
       while(a[i] >= b[j]){
           long temp = a[i];
           a[i] = b[j];
           b[j] = temp ;
           i-- ;
           j++ ;
       }
       // at last sort the both array 
       Arrays.sort(a);
       Arrays.sort(b);

      // time complexity : O(Min(N,M)) where the condition false then  worth case
      // and O(nlogn) + O(mlogm) for sorting overall  
        

     // most optimal Solution :












    }
}
