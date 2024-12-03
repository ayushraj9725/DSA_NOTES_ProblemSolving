import java.util.HashMap;

public class String6 {
    public static char firstNonRepeating(String str) {
	 HashMap<Character,Integer> h = new HashMap<>();
    
        for(int i = 0 ; i < str.length() ; i++){
            if(h.containsKey(str.charAt(i))){
               h.put(str.charAt(i),h.get(str.charAt(i)) + 1)  ;
            }
            else{
                h.put(str.charAt(i),1) ;
            }
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(h.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
      
	     return '#' ;
	}
}
