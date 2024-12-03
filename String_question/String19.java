class String19 {
    /*public boolean isAnagram(String s, String t) {
        // brute force method 

        if(s.length() != t.length()) return false ;
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr,tarr) ;
    }
    //  taking O(n logn ) time complexity and space O(n) where O(26) approx O(1)*/

   /* public boolean isAnagram(String s, String t) {
       // Better approach .(using hashmap )

       if(s.length() != t.length()) return false ;
       HashMap<Character,Integer> h = new HashMap<>();

       for(int i = 0 ; i < s.length() ;i++){
          h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1) ;
       }
       for(int i = 0 ; i < t.length() ;i++){
          if(!h.containsKey(t.charAt(i)) || h.get(t.charAt(i)) == 0){
               return false ;
          }
          h.put(t.charAt(i),h.get(t.charAt(i)) - 1) ;
       }
     return true ;

     //taking O(n) time and O(n) space O(26) that is approx O(1) 

    } */


    public boolean isAnagram(String s, String t) {
        // otimal approach using count array . that contain 26 integer primive value
        
        if(s.length() != t.length()) return false ;
 
        int c[] = new int[26] ; // initally assignd by zero in java
        for(int i = 0 ; i < s.length() ;i++){
            c[s.charAt(i) - 'a']++ ;
            c[t.charAt(i) - 'a']-- ;
        }
        for(int i : c){
          if(i != 0) return false ;
        }
 
        return true ;
 
        // taking O(n) time and space we are using fix that is 26 so O(1) s.c.
      }
   }
 
 
 
 
 
 
 
       /* HashMap<Character,Integer> h = new HashMap<>();
        // we cant do this for some cases if even no of char present already in s or t then face issue
         for(int i = 0 ; i< s.length(); i++){
             if(h.containsKey(s.charAt(i))){
                 h.put(s.charAt(i),h.get(s.charAt(i))+1);
             }
             else{
                 h.put(s.charAt(i),1);
             }
         }
         h1.putAll(h) ;
         for(int i = 0 ; i< t.length(); i++){
             if(h.containsKey(t.charAt(i))){
                 h.put(t.charAt(i),h.get(t.charAt(i))+1);
             }
             else{
                  h.put(t.charAt(i),1);
             }
         }
          for(Integer i : h.values()){
             
             if(i % 2 != 0){
                 return false ;
             }
 
          }
          return true ;
     }
 } */
