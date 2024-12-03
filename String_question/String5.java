public class String5 {
    public static String removeVowels(String str) {
        String vowels = "aeiouAEIOU" ;
        StringBuilder s = new StringBuilder(str);
 
        for(int i = 0 ; i < s.length() ; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                s.deleteCharAt(i);
                i-- ;
            }
        }
        return s.toString();
     }
}
