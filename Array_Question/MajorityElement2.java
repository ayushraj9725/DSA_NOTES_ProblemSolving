import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
     public List<Integer> majorityElement(int[] nums) {
   /*     // Brute Force approach 
        List<Integer> l = new ArrayList<>();
        int n = nums.length ;
        if(n == 1) {
            l.add(nums[0]);
            return l ;
        }                               // Brute Force 
        if(n == 2){
            l.add(nums[0]);
            if(nums[0] != nums[1]){
                l.add(nums[1]);
            }   
            return l ;
        }
        for(int i = 0 ; i < n ; i++){ // n time taking here
             if(l.size() == 0 || l.get(0) != nums[i]){
                int count = 0 ;
                for(int j = 0 ; j < n ; j++){  // n time takin for every so overall O(n^2)
                   if(nums[j] == nums[i]) count++ ;
                }
                if(count > n/2) l.add(nums[i]) ;
             }
             if(l.size() == 2) break ; // always taking 2 space for return 
        }

        return l ; // return the resultant list l 

        */

        // Better Solution 
     /*
       int n = nums.length ;
       List<Integer> l = new ArrayList<>();
       if(n == 1) {
          l.add(nums[0]);
          return l ;
       }
       if(n == 2){
        l.add(nums[0]);
          if(nums[0] != nums[1]) l.add(nums[1]);
          return l ;
       }
       
       HashMap<Integer,Integer> hm = new HashMap<>(); // element,count
       for(int i = 0 ; i < n ; i++){   // n time to store the every element to hashmap
           if(hm.containsKey(nums[i])){
              hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
           }
           else {
              hm.put(nums[i],1);
           }
       }

       // once again iterate the Hashmap
       for(int e : hm.keySet()){   // O(n/2) approx iterating the Hashmap 
          if(hm.get(e) > n/3) {
             l.add(e);
          }
       }

       return l ; // overall taking O(2n) time 
     */  

       // Most Better Solution 
/*
        int n = nums.length ;
       List<Integer> l = new ArrayList<>();
       if(n == 1) {
          l.add(nums[0]);
          return l ;
       }
       if(n == 2){
        l.add(nums[0]);
          if(nums[0] != nums[1]) l.add(nums[1]);
          return l ;
       }
       
       HashMap<Integer,Integer> hm = new HashMap<>(); // element,count
       for(int i = 0 ; i < n ; i++){   // n time to store the every element to hashmap

           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    
           if(hm.get(nums[i]) > n/3 && !l.contains(nums[i])){
                  
                  l.add(nums[i]) ;   // adding in list if any hash value goes greater than n/3
           } 

           if(l.size() == 2) break ;
       }

        return l ;

        */


        // most optimal solution using : moor's voting algorithm

         int n = nums.length ;
         int count1 = 0 , count2 = 0 ;
         int ele1 = Integer.MIN_VALUE , ele2 = Integer.MIN_VALUE ;
         for(int i = 0 ; i < n ; i++){
            if(count1 == 0 && nums[i] != ele2){
                count1 = 1 ;
                ele1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != ele1){
                count2 = 1 ;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1) count1++ ;
            else if(nums[i] == ele2) count2++ ;

            else{
                count1-- ;
                count2-- ;
            }
         }
        List<Integer> list = new ArrayList<>();
        int cnt1 = 0 , cnt2 = 0 ;  // manually checking for element that count greater than n/3
        for(int i = 0 ;i < n ; i++){
            if(ele1 == nums[i]) cnt1++ ;
            if(ele2 == nums[i]) cnt2++ ;

        }
        int min = (int)(n/3) + 1 ;
        if(cnt1 >= min) list.add(ele1);
        if(cnt2 >= min) list.add(ele2) ;

        return list ;

 // time complexity taken here O(2n) only for iterating the array two times and no space used here any so optimal




    }
}
