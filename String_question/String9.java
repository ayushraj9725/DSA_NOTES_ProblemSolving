public class String9 {
    public static StringBuilder replaceSpaces(StringBuilder str) {
        String s = "@40" ;
        StringBuilder str1 = new StringBuilder("");
     for(int i = 0 ; i < str.length(); i++){
         if(str.charAt(i) != ' '){
             str1.append(str.charAt(i));
         }
         if(str.charAt(i) == ' ') {
             for(int j = 0 ; j < s.length() ;j++){
                 str1.append(s.charAt(j));
             }	   // we can use substring to append that here in strinbuilder
         }
     }
return str1 ;
}
}
