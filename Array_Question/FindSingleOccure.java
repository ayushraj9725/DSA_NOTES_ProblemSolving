public class FindSingleOccure {
    public static int getSingleElement(int []arr){
        /*       // Brute force approach 
               int result = 0 ;
               for(int i = 0 ; i < arr.length ; i++){
                   int num = arr[i];
                   int count = 0 ;
                   for(int j = 0 ; j < arr.length ; j++){
                       if(arr[j] == num){
                           count++ ;
                       }
                   }
                   if(count == 1){
                       result = num ;
                   }
               }
               return result ; // O(N*N) time taking and space O(1)
       
       */
               //Better solution , type 1 taking max size array , set frequency by 0
       
        /*
       
       
               //int max = Arrays.stream(arr).max().getAsInt();
               int max = 0 ;
               for(int i = 0 ; i < arr.length ;i++){
                   max = Math.max(max,arr[i]);
               }
               int id[] = new int[max+1];
                                                            // when we do thi Arrays.fill(id,0) ;  it will creat problem like redundant bcz 0 initialized by 0 by default// set frequency by 0
               for(int i = 0 ; i < arr.length ; i++){
                   id[arr[i]] += 1 ;
               }
               for(int i = 0 ; i < arr.length ; i++){
                   if(id[arr[i]] == 1){                             // or we acn check here id[i] == 1 and i , but it can creat problem in max is more greater and other every small
                       return arr[i] ;
                   
                   }
               }
               return -1 ;  // here the time used O(n+n+n) and space is more so , it depends upon input ,if arr is 10^9 and its max will become very large so memory uses more .
       */
       
        // Better approach is using HashMap data structure 
          /*    
                HashMap<Integer,Integer> m = new HashMap<>();
                                       // n space is used for unique key
                for(int i : arr){  // n time taken
                    m.put(i,m.getOrDefault(i,0)+1) ;
                }   
                for(Integer i : arr){   // n/2 time taken if array is sorted , but if array is not sorted then it goes for the n 
                    if(m.get(i) == 1){
                        return i ;
                    }
                }
                return -1 ;  // overall O(n) time and n space used 
          
       */
       
               // Optimal solution , that is using XOR operation
       
               int xor = 0 ;
               for(int i = 0 ; i < arr.length ;i++){
                   xor = xor ^ arr[i];
               }
               return xor ;   // taking only O(n) time and space O(1) .
       
       
       
       
       
            }
       
       
}
