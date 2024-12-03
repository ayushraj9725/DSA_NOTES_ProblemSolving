public class String4 {
    public static String stringReverse(char[] arr) {
     
        int i = 0 ;
        int j = arr.length - 1 ;
   
        while(i < j){
           char t = arr[i] ;
           arr[i] = arr[j] ;
           arr[j] = t ;
           i++ ;
           j-- ;
        }
      //  StringBuilder s = new StringBuilder(arr) ;
   
        return new String(arr) ; //s.toString() ;
    }
}
