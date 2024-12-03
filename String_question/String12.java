public class String12 {
    public static int countVowels(String s){
        int count = 0 ;
        String vowels = "aeiouAEIOU" ;
        for(int i = 0 ; i < s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++ ;
            }
        }
        return count ;
    }
    public static Boolean splitString(String str) {
        if(str.length() % 2 != 0) return false ;

        int start1 = 0 , end1 = str.length()/2 ;
        int start2 = str.length()/2 , end2 = str.length() ;

        String substring1 = str.substring(start1,end1) ;
        String substring2 = str.substring(start2,end2) ;

        int count1 = countVowels(substring1);
        int count2 = countVowels(substring2);
        if(count1 != count2 ) {
                return false ;
        }
        return true ;
    } /* the time complexity is O(N) and space O(N) also
       for using 2 substring of half and half */
}
