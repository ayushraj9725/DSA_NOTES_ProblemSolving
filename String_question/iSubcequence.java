class iSubcequence {
    public boolean isSubsequence(String s, String t) {
        // the brute force approach is to take a temp str and used nested loop check
        // s[i] == t[i] if yes then add elemt into temp str and so on and along with we
        // have to track tghe indices pf both the , not doing this thing move to optimal
        // solution : two pointers approach

        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // only when it is found like that
            }
            j++;// Otherwise we increase always j pointer
        }
        // at the ned of the day we found if i has what that is euqal to s length then
        // return true otherwise false
        return i == s.length(); // time taken O(t.length) ; consider O(n+m) s length and t length

        /*
         * HashSet<Integer> set = new HashSet<>();
         * for(int i = 0 ; i < t.length() ; i++){
         * set.add(t.charAt(i) - 'a');
         * }
         * 
         * for(int i = 0 ; i < s.length() ;i++){
         * int c = s.charAt(i) - 'a' ;
         * if(!set.contains(c)){
         * return false ;
         * }
         * }
         * return true ;
         * /// this is not the actual answer it's wrong to define consequence
         */
    }
}