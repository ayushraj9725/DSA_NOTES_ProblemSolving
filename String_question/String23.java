public class String23 {
    public char findTheDifference(String s, String t) {
        char r = 0, rr = 0 ;
        for(int i = 0 ; i < s.length() ;i++){
              r = (char)(r + s.charAt(i)) ; 
        }
        for(int i = 0 ;i < t.length(); i++){   
              rr = (char)(rr + t.charAt(i)) ;
        }

        char result = (char)(rr - r) ;

        return result ;
        // this is taking O(n) and O(n+1) overall O(n) time and space in O(1)
        // it is near optimal but here some overflow is possible in java that is not happend but other langusge case
        // this problem of overflow issue can be facing so , more optimal is xor approaches 
    } 
   /* public char findTheDifference(String s, String t) {
    char result = 0;
    for (int i = 0; i < s.length(); i++) {
        result ^= s.charAt(i); // XOR all chars in s
    } // if you have any confision for this case you dry run
    for (int i = 0; i < t.length(); i++) {
        result ^= t.charAt(i); // XOR all chars in t
    }
    return result; // The remaining value is the extra character 
           // takin O(n) time and space O(1)
   }*/
}
