public class String10 {
    public static String reverseString(String str) 
	{
		   String[] s = str.trim().split("\\s+") ;
      // string converted into string array after removeing 
	     // leadinga and Trailing whilespace ,tab and new line ;

		   StringBuilder reversed = new StringBuilder() ;

		   for(int i = s.length - 1 ; i >= 0 ;i--){
			    reversed.append(s[i]);
                if(i != 0){
					reversed.append(' ');
				}
		   }
	      return reversed.toString() ;
	}
}
