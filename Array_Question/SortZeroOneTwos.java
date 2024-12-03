import java.util.ArrayList;

public class SortZeroOneTwos {
    public static void swap(ArrayList<Integer> l ,int i , int j){
         int temp = l.get(i);   // swaping here so write method
         l.set(i,l.get(j));
         l.set(j,temp) ;
     }


     
    public static void sortArray(ArrayList<Integer> arr, int n) {
 // Brute force approach is sort the array using sorting algorithms

 //   Collections.sort(arr); this is taking O(n logn) and space O(1)

 // Better solution 
   /*     int count0 = 0 , count1 = 0 , count2 = 0 ;
        for(int i = 0 ; i < n ; i++){  // this is happend in O(N) time
            if(arr.get(i) == 0) count0++ ;
            else if(arr.get(i) == 1) count1++;
            else  count2++ ;
        }
        for(int i = 0 ; i < count0 ;i++){
            arr.set(i,0);
        }
        for(int i = count0 ; i < count0 + count1 ; i++){
            arr.set(i,1);
        }
        for(int i = count0+count1 ; i < n ; i++){
            arr.set(i,2);
        }
        //these 3 loop run till n .
        //overall time complexity here O(n+n) space O(1).
  */


      // optimized the code using Dutch National flag Algorithm


     
     int low = 0 , mid = 0 , high = n -1 ;
     while(mid <= high){
        if(arr.get(mid) == 0){
            swap(arr,low,mid);
            low++;
            mid++;
        }
        else if(arr.get(mid) == 1){
            mid++ ;
        }
        else{
            swap(arr,mid,high);
            high-- ;
        }
     }
  
  // this is using time for only n iteration
  // so time complexity will O(N) only and space O(1)
  // so this is most optimal solution







    }
}
