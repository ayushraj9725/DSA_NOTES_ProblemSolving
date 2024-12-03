public class String3 {
    public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		int i = 0 ;
		int j = ch.length - 1 ;

		while(i <= j){
			char t = ch[i] ;
			ch[i] = ch[j] ;
			ch[j] = t ;

			i++ ;
			j-- ;
		}
	
		//String str1 = String.valueOf(ch[i]);
        str = new String(ch);
		return str ;
	}
}
