import java.util.HashSet;

public class LongestSequence {
     public static boolean CheckLinearS(int arr[],int n){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n) return true ;
        }
        return false ;
    }
    public static int longestSuccessiveElements(int []a) {
   /*     // Brute Force Approaches 
        int longest = 1 ;
        int n = a.length ;
        for(int i = 0 ; i < n ;i++ ){
            int x = a[i];
            int count = 1 ;
            while(CheckLinearS(a,x+1) == true){
                x = x + 1 ;
                count = count + 1 ;
            }
            longest = Math.max(longest,count); // updating the longest by max 
        }

        return longest ;
        // time compexity is near to O(N^2) and space O(1)

        */
   

       // Better Approach 
/*
       Arrays.sort(a);
       int longest = 1 ;
       int count = 0 ;
       int last_smaller = Integer.MIN_VALUE;
       for(int i = 0 ; i < a.length ;i++){
           if(a[i] - 1 == last_smaller){
               count += 1 ;
               last_smaller = a[i];
           }
           else if(last_smaller != a[i]){
               count = 1 ;
               last_smaller = a[i];
           }
           longest = Math.max(longest,count);
       }
       return longest ;

     // this is taking O(N + nlogN) time with no space 

   */

      // most Optimal Solution

      
     int n = a.length ;
     if(n == 0) return 0 ;
     int longest = 1 ;
     HashSet<Integer> set = new HashSet<>();

     // adding all the elements in the set 
     for(int i = 0 ; i < n ; i++){  // O(N) time taken
         set.add(a[i]);
     }
     // checking element in set 
     for(int e : set){
         if(!set.contains(e - 1)){
             int count = 1 ;
             int x = e ;
             while(set.contains(x+1)){
                 count =count + 1 ;
                 x = x + 1 ;
             }
             longest = Math.max(longest,count);
         }
     }
    return longest ;
    // time complexity will be O(N + N) if set has not collision , if that exist then brute force is better than this , because both time we are searching the element 
    // space is used here O(N) to store the element into the set .














    }
}
