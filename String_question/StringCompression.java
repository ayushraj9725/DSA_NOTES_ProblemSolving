public class StringCompression {
    public int compress(char[] chars) { //this chars do not treat like charArray
        String s = new String(chars);
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < s.length()  ; i++){
             Integer count = 1 ;
           
           while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)){
               count++ ;
               i++;
             }
             result.append(s.charAt(i));
             if(count > 1){
             result.append(count.toString());
           }
        }

         String compressedString = result.toString();
         for (int j = 0; j < compressedString.length(); j++) {
              chars[j] = compressedString.charAt(j);
        }
       
        return compressedString.length();
    }
}
