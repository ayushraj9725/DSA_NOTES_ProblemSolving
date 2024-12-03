import java.util.Arrays;
import java.util.Collections;

public class String17 {
    /* public String reverseWords(String s) {
        String[] w = s.split(" +") ; //  n time takin

        StringBuilder reversed = new StringBuilder() ; // O(n) space taking

        for(int i = w.length - 1 ; i >= 0 ; i--){ // n time takin
            reversed.append(w[i]);
            if(i != 0){
                reversed.append(' '); // adding space btw the words 
            }
        }

        return reversed.toString().trim() ;  // over all O(n) t.c and s.c both

        */
        // also we acn use it 
     public String reverseWords(String s) {
         String[] w = s.trim().split(" +"); // n time taking
         Collections.reverse(Arrays.asList(w)); // n time taking
         return String.join(" ", w) ; // delimitering here by joing in n space
         
    }
}
