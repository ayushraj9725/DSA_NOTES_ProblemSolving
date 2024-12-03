class MissingNumber1 {
    public static int missingNumber(int []a, int N) {

        /* for(int i = 1 ; i <= N ; i++){
              int flag = 0 ;
             for(int j = 0 ; j < N ; j++ ){
                 if(a[j] == i)
                 {
                 flag = 1 ;
                 break ;
               }
             }
             if(flag == 0){ // if any i is not found in arr then 
             return i ;
           }
         }
         
         return -1 ; // time complexity O(N*N) */
 
 /*
 
  // better approach
 
 
         HashMap<Integer,Integer> m = new HashMap<>();
         
         for(int i = 1 ; i<=N ; i++){
             m.put(i,0);
         }
         for(int i = 0 ; i < a.length ; i++)
             {
        // here we are update by 1 only for that key eqaul to a[i]
             m.put(a[i],1) ;
             }
        // checking which key has value 0 exect , so return that key
         for(Map.Entry<Integer,Integer> i : m.entrySet()){
             if(i.getValue() == 0){
                 return i.getKey() ;
             }
         }
         return - 1 ;
     // time complexity in this scenario O(n+n+n) and space O(n)
 
 
 
                                                                /* if(m.containsKey(i+1) == a[i]){
                                                                    m.put(i+1,1) ;
                                                                    for ding this dose not means anything
                                                                  }   */
    
 /*
     // better approach using array 
 
     int id[] = new int[N+1];
     Arrays.fill(id,0);
 
     for(int i = 0 ; i < N ; i++){
         id[a[i]] = 1 ;   // update the value by one at that all value that is present in array a
     }     
     for(int i = 1 ; i <= N ;i++){
         if(id[i] == 0){
             return i ;
         }
     }
      return -1 ; // O(n+n+n) time and space O(n)
  
 */
 
 
 
 
 
 
 
 
  // Optimal approch / optimized solution
  // 1 is findinf sum 
     int sum = 0 ;
     long sum_of_no = N*(N+1)/2 ;
     for(int i= 0 ; i < N ; i++){
         sum = sum + a[i] ;
     }
    
    int result = (int)(sum_of_no - sum) ;
 
    return result ;
 
    // it will take n times and O(1) space 
    // but calculating sum for lager no of element or large no , i can creat complex
 
   
 
 
 
 
     }
}