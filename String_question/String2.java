public class String2 {
    /*public static char toLowerCase(char ch){
		char t ;
		if(ch >= '0' && ch <= '9') return ch ;
		else if(ch >= 'a' && ch <= 'z'){
			return ch ;
		}

		else{
			 t = (char)(ch - 'A' + 'a') ;
			//return t ;
		}
		return t ;
	}*/
	public static boolean checkPalindrome(String str) {

        char[] ch = str.toCharArray();
        int i = 0 ;
        int j = ch.length - 1 ;
        
       while(i < j){
          while(i < j && !Character.isLetterOrDigit(ch[i])){
              i++ ;
          }
          while(i < j && !Character.isLetterOrDigit(ch[j])){
              j-- ;
          }
          if(Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])){
              return false ;
          }

          i++ ;
          j-- ;
       }

     return true ;

  /* for(int i = 0 ; i < n/2 ;i++){
       if(character.isDigit(str.charAt(i)) != Character.isDigit(str.charAt(n-1-i))){
           return false ;
       }
       if(toLowerCase(str.charAt(i)) != toLowerCase(str.charAt(n - 1 -i))){
           return false ;
       }
   }
   return true ; */
   
   /*
    * Overall Time Complexity:
Since the algorithm processes each character of the input string exactly once, the overall time complexity is O(n), 
where n is the length of the input string ch.
Space Complexity:
The space complexity is O(1) because the algorithm uses a constant amount of extra space
 (only the pointers i, j, and a few temporary variables for the comparisons). It operates directly on the input array ch without needing additional data structures.
    */
 }
}
