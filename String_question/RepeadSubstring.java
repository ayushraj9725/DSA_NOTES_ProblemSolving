public class RepeadSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length()  ;
       for(int i = n/2 ; i > 0 ;i--){
          if(n % i == 0){  // we are checking for repeating substring excect till n 
              String substr = s.substring(0,i) ;
              StringBuilder str = new StringBuilder();
              for(int j = 0 ; j < n/i ; j++){
                 str.append(substr) ;
              }
              if(str.toString().equals(s)){
               return true ;
              }
          }
       }
       return false ; 
   }
} /**  time complexity is for outer loop 0 to n/2 that is (n) and for inner loop 0 to
  n/i  that is also comes in O(n) so over all O(n^2) and space O(n) in worth*/
  // other approaches - KMP (Knuth-Morris-Pratt) String Matching Algorithm:
  // concatenation string   , both take O(n) time
  // str = s + s 
  // return str.substring(1,str.length()-1).contains(s)
