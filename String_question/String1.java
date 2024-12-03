
public class String1 {
    public static int makeBeautiful(String str) {

        int n = str.length() ;
        int count1 = 0 ; 
        int count2 = 0 ;

        // there are only two possiblity one strating with '0' 
         
         char expected = '0' ;
         for(int i = 0 ; i < n ; i++){
             if(str.charAt(i) != expected){
                 count1++ ;
             }
            expected = ( expected == '0' ) ? '1' : '0' ;
         }

         // starting with possiblity '1' 
         expected = '1' ;
         for(int i = 0 ;i < n ;i++){
             if(str.charAt(i) != expected){
                 count2++ ;
             }
            expected = (expected == '1') ? '0' : '1' ;
         }

         return Math.min(count1,count2);




          /*int count1 = 0 ;
          int count2 = 0 ;
          
          char ch1[] = str.toCharArray();
          char ch2[] = str.toCharArray();

          
          int n1 = ch1.length - 1 ;
          int n2 = ch2.length - 1 ;

          for( i = 0 ; i < n1 ; i++){
              if(ch1[i] == ch1[i+1] ){
                if(ch1[i] == '1'){
                    ch1[i] = '0' ;
                }
                else{
                    i++;
                }
                count1++ ;
              }
          }
        
          for(int i = n2 ; i > 0 ; i--){
             if(ch2[i] == ch2[i-1]){
                if(ch2[i] == '1'){
                    ch2[i-1] = '0' ;
                }
                else{
                    ch2[i-1] = '1' ;
                }
                count2++ ;
              }
          }
         /* if(count1 > count2){
              return count2 ;
          }

          return count1 ; 

          return Math.min(count1,count2) ;*/
          
    }
}