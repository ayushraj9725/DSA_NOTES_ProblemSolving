public class MajorityElement {
    public static int majorityElement(int []v) {
        /*     
             // Brute Force Approach
             for(int i = 0 ; i < v.length ; i++){
                 int count = 0 ;
                 for(int j = 0 ; j < v.length ;j++){
                     if(v[i] == v[j])  count++ ;
                 }
                 if(count > v.length/2) return v[i];
             }
             return -1 ;
    
             // time complexity : O(N^2) 
             // Space Complexity : O(1)
             
             */
    
    
             // Better Solution using HashMap (Hashing)
    /*
    
            int majority = 0 ;
    
            HashMap<Integer,Integer> m = new HashMap<>();
    
            for(int i = 0 ; i < v.length ; i++){
                if(m.containsKey(v[i])){
                    m.put(v[i],m.getOrDefault(v[i],0)+1);
                }
                else{
                    m.put(v[i],1);
                }
            }
          /*  for(Integer i : m.keySet()){
                if(m.get(i) > v.length) {
                    majority = i ;
                }
            }    // we can use one of them keySet or entrySet()
    
            for(Map.Entry<Integer,Integer> i : m.entrySet()){
                if(i.getValue() > v.length/2){
                    majority = i.getKey() ;
                }
            }
    
            return majority ;
    // time complexity taken : O(N + N) and , and space O(N).
    
     */
      
    
      // move to the Optimal Solution ;  moore's voting algorith 
    
          int count = 0 ;
          int majority = 0;
          for(int i = 0 ; i < v.length ; i++){ // n time used here
              if(count == 0){
                  count = 1 ;
                  majority = v[i];
              }
              else if(v[i] == majority) count++ ;
              else count-- ;
          }
    
          int no_of_contain_majority  = 0 ;

          for(int i = 0 ; i < v.length ;i++){  // n time used here for checking 
              if(v[i] == majority){
                  no_of_contain_majority++ ;
              }
          }
          if(no_of_contain_majority > v.length/2) {
    
              return majority ;
          }
    
          return -1 ;
    
          // overAll time complexity will be O(N+N)
          // because here not used any extra space , space complexity will O(1) 
    
    
    
        }
}
