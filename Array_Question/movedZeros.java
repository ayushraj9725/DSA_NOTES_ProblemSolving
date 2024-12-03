class movedZeros {
    /*  public static int[] moveZeros(int n, int []a) {  
            // brute force method 
          int temp[] = new int[n] ;  // O(n)  space taken
          int index = 0 ;
          for(int i = 0 ; i < n ; i++){
              if(a[i] != 0){
                  temp[index] = a[i] ;   // O(n) time taken
                  index++ ;
              }
          }
          int nze = temp.length ;
          for(int i = 0 ; i < nze ;i++){   // O(k) time taken
              a[i] = temp[i] ;
          }
          for(int i = nze ; i < n ;i++){    // O(n-k) time taken 
              a[i] = 0 ;
          }


          return a ;  // overall taken O(N) time and space both  */

          public static int[] moveZeros(int n, int []a) {  

            /*       int index = 0 ; // O(1) place taken
      
                    for(int i = 0 ; i < n ;i++){  //O(n) time move
                        if(a[i] != 0){
                            a[index] = a[i] ;
                            index++ ;
                        }
                    }
                    for(int i=index ; i < n ; i++){
                        a[i] = 0 ;          // here O(n-index) time 
                    }
                    return a ;
                   // over all taken O(n) time and space O(1) 
                 // that is optimal solution 
       */
          
        /*     int i = 0; // Pointer for the position where the next non-zero should go
          
             for (int j = 0; j < n; j++) {
                if (a[j] != 0) {
                  // Swap a[i] and a[j]
                  int temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                  i++; // Increment i to point to the next position
              }
          }
          
          return a;     */
      
             int j = -1 ;
             for(int i = 0 ; i < n ; i++){
                 if(a[i] == 0){
                     j = i ;
                     break;
                 }
             }
             if(j == -1) return a ;
             for(int i = j+1 ;i < n  ;i++){
                 if(a[i] != 0){
                     int temp = a[i];
                     a[i] = a[j] ;
                     a[j] = temp ;
                     j++ ;
                 }
             }
            return a ;
      
      
          }
      }
