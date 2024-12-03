public class MajorityElement1 {
    public int majorityElement(int[] nums) {
        /*      for(int i = 0 ; i < nums.length ; i++){
                  int count = 0 ;
                  for(int j = 0 ; j < nums.length ; j++){
                      if(nums[j] == nums[i]){
                          count++ ;
                      }
                  }
                  if(count > nums.length/2) return nums[i];
              }
              return -1 ;
          } */
          // this is brute force approach 
          // it takes O(N^2) time that is not efficient 
      
        /*  // better Solution
          HashMap<Integer , Integer> m = new HashMap<>();
          for(int i = 0 ; i < nums.length ;i++){
              if(m.containsKey(nums[i])){
                  m.put(nums[i],m.getOrDefault(nums[i],0)+1);
              }
              else{
                  m.put(nums[i],1);
              }
          }
      
           for(int i : m.keySet()){
              if(m.get(i) > nums.length/2){
                  return i ;
              }
           }
            return -1 ;
          }
         */
      
         // most optimal solution using moor's voting algorithm
            int cnt = 0 ;
            int majority = 0 ;
            for(int i = 0 ; i < nums.length ; i++){
              if(cnt == 0){
                  cnt = 1 ;
                  majority = nums[i];
              }
              else if(nums[i] == majority) cnt++;
              else cnt-- ;
            }
            int cnt1 = 0 ;
            for(int i = 0 ; i < nums.length ;i++){
                if(nums[i] == majority) cnt1++ ;
            }
            if(cnt1 > nums.length/2) return majority ;
      
            return -1 ;
      
            // time complexity used here O(N+N) for both of loop
            // not used any extra space so sc will O(1) ;
          }
}
