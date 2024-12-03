public class String15 {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder("");

        for(int i = s.length() - 1 ; i >= 0 ; i--){
           if(s.charAt(i) == ' ' && sb.length() == 0){
               continue ;
           }
           if(s.charAt(i) == ' ' && sb.length() > 0 ){
               break ;
           }
           if(s.charAt(i) != ' '){
               sb.append(s.charAt(i));
           }
        }
        sb.toString();
        return sb.length() ;
   }
}
