import java.util.Arrays;

public class String8 {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
         int[] maps1 = new int[256];
         int[] maps2 = new int[256];
         Arrays.fill(maps1,-1);
         Arrays.fill(maps2,-1);
         for(int i = 0 ;i < str1.length() ;i++){
             char s1 = str1.charAt(i) ;
             char s2 = str2.charAt(i) ;
             if(maps1[s1] != -1 && maps1[s1] != s2) return false ;
             if(maps2[s2] != -1 && maps2[s2] != s1) return false ;

             maps1[s1] = s2 ;
             maps2[s2] = s1 ;

         }
         return true  ;
    }
}
