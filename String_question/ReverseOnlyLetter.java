public class ReverseOnlyLetter {
    public String reverseOnlyLetters(String s) {
        char c[] = s.toCharArray();
       int i = 0 ;
       int j = c.length - 1 ;
       char t ;
       while(i < j){

           while(i < j && !Character.isLetter(c[i])){
               i++ ;
           }
           while(i < j && !Character.isLetter(c[j])){
               j-- ;
           }
           t = c[i] ;
           c[i] = c[j] ;
           c[j] = t ;
           i++ ;
           j-- ;
       }

       s = new String(c) ; // time and space complexity  both O(n)
       return s ;
   }
}
