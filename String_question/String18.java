import java.util.HashMap;

public class String18 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h = new HashMap<>();
   // set at hashmap , s char as key and value t's charcater 
        for(int i = 0 ; i < s.length() ; i++){
            if(h.containsKey(s.charAt(i))){  // checing if key present 
                if(!h.get(s.charAt(i)).equals(t.charAt(i))){ // if key present then check key's value equal to mapped or not
                   return false ;   // please check leetcode 2nd case ans dry run then you easly revised concept condition 
                }
            }
            else{
                if(h.containsValue(t.charAt(i))){ // if key is not present then check value of hashmap taking from t string ,if present return false
                    return false ;           // if not hm has not value then put / add the key and value 
                }
                h.put(s.charAt(i),t.charAt(i)); // from here 
            }
        }
        return true ; // time complexity O(n) we are running one loop only
                    // space complexity what space taking hashmap in worth cas O(n) in best O(1)
    }
}
/*  
    other approaches discussing here .
    Check if the lengths of both strings are the same. If they are not, return false.
    Iterate over both strings simultaneously and map characters from s to t and vice versa.
    For each character in s, check:
    If there’s a previous mapping for the character, it should match the corresponding character in t.
    If not, create a new mapping.
    Similarly, check the reverse mapping from t to s.

    here use are using 2 hashmap .
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create two HashMaps to track character mappings from s to t and t to s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);  // current char from s
            char chT = t.charAt(i);  // current char from t

            // Check mapping from s -> t
            if (mapST.containsKey(chS)) {
                // If already mapped, it should match the current char from t
                if (mapST.get(chS) != chT) {
                    return false;
                }
            } else {
                mapST.put(chS, chT);  // Map s -> t
            }

            // Check mapping from t -> s
            if (mapTS.containsKey(chT)) {
                // If already mapped, it should match the current char from s
                if (mapTS.get(chT) != chS) {
                    return false;
                }
            } else {
                mapTS.put(chT, chS);  // Map t -> s
            }
        }
        return true;
    }
     
    // time C - > here  O(n)
    // space C -> two hashmap used so O(n) in worrth case 

    // 2nd approach is array using acsii value 
    
    Instead of using hash maps, we can use arrays to store the mappings for both s and t 
    if the strings contain only ASCII characters (256 characters max).
     
     public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store mappings for s -> t and t -> s
        int[] mapST = new int[256];  // mapping from s to t
        int[] mapTS = new int[256];  // mapping from t to s

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);  // current char from s
            char chT = t.charAt(i);  // current char from t

            // Check if there's a mismatch in mappings
            if (mapST[chS] == 0 && mapTS[chT] == 0) {
                // No previous mapping, establish new mapping
                mapST[chS] = chT;
                mapTS[chT] = chS;
            } else if (mapST[chS] != chT || mapTS[chT] != chS) {
                // If the mapping doesn't match, return false
                return false;
            }
        }
        return true;
    }
    //  it is optimal case 
    //The array approach is more optimized in terms of space for strings with limited character sets (like ASCII).
     
     // tc - > O(n)
     // sc -> take constant size array 256 that is using O(1)

     //or 
     public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        // Initialize the arrays with -1
        Arrays.fill(mapS, -1);
        Arrays.fill(mapT, -1);

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If there's already a mapping and it's inconsistent, return false
            if (mapS[sChar] != -1 && mapS[sChar] != tChar) return false;
            if (mapT[tChar] != -1 && mapT[tChar] != sChar) return false;

            // Create the mapping
            mapS[sChar] = tChar;
            mapT[tChar] = sChar;
        }

        return true;
    }

 */

