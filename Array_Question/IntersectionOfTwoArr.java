import java.util.*;
public class IntersectionOfTwoArr {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*      
               // we are taking a set 
               Set<Integer> s = new HashSet<>();
               for(int num : nums1){
                  s.add(num);   //  remove all duplicates from nums1 and add into set
               }
              // now we take again new set for storing result , which are containing in the set
               Set<Integer> result = new HashSet<>();
               for(int num : nums2){
                  if(s.contains(num)){
                      result.add(num);
                  }
               }
               // converting again set into array primitive 
               int r[] = new int[result.size()];
               int i = 0 ;
               for(Integer num : result){
                     r[i++] = num; // storing all element from set to array int type
               }
      
               return r ;//this is optimal solution taken O(n+m) time and sapce O(min(n+m))
                // and same like we can use HashMap , take same time and O(n+min(n+m)) space
      */
      /*
                // other approaches 
                // using sorting + two pointers 
                Arrays.sort(nums1);
                Arrays.sort(nums2);
                Set<Integer> s = new HashSet<>();
                int i = 0 , j = 0; 
                while( i < nums1.length && j < nums2.length){
                  if(nums1[i] == nums2[j]){
                      s.add(nums1[i]);
                      i++ ;
                      j++ ;
                  }
                  else if(nums1[i] < nums2[j]){
                      i++ ;
      
                  }
                  else{
                      j++ ;
                  }
                } 
                // convert that set int again in Array 
                int r[] = new int[s.size()];
                int x = 0 ;
                for(int n : s){
                  r[x++] = n ;
                }
                return r ; //  this method taken O(nlogn + mlogm) for sorting and O(n+m) for iterating using two pointers  and space O(min(n,m))
      */
                // third approaches is using Binarysearch() by sort one array only
      
                Arrays.sort(nums1) ; // O(n logn) takes time
                Set<Integer> s = new HashSet<>(); // here space used O(min(n+m))
                for(int n : nums2){
                  if(Arrays.binarySearch(nums1 , n) >= 0){  // takes here O(logn) time binary search
                      s.add(n);                      // so for n takes O(nlogn) time
                  }
                }
                int r[] = new int[s.size()];
                int x = 0 ;
                for(int n : s){
                  r[x++] = n ;
                }
              return r ;
          }
}
