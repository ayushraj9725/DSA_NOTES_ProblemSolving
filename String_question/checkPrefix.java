public class checkPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // first we have split it into array 
        String[] s = sentence.split(" ");

        for(int i = 0 ; i < s.length ;i++){
            if(s[i].startsWith(searchWord)){ // special method keep in mind
                return i+1 ;
            }
        }
        return -1 ;
    }// O(n) time and O(1) space 
}
