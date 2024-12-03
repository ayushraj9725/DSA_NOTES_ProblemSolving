public class String21 {
    public static boolean checkVowels(char c){
        String vowels = "aeiouAEIOU" ;
        if(vowels.indexOf(c) != -1){
            return true ;
        }
        return false ;
    }
    public String reverseVowels(String s) {

        char ch[] = s.toCharArray();
        int i = 0 ;
        int j = ch.length - 1 ;

        while(i < j){
            while(i < j && !checkVowels(ch[i])){
                i++ ;
            }
            while(i < j && !checkVowels(ch[j])){
                j-- ;
            }
            char t = ch[i] ;
            ch[i] = ch[j] ;
            ch[j] = t ;
            i++ ;
            j-- ;
        }
        return new String(ch);
    }
}
