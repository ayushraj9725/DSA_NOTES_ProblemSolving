public class firstMissingAndRepeating {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        // Optimal Solution : Using Maths formula that is sum of n integer number and
        // sum of all elemt of array
        // and sum of n square numbers from 1 to n
        long n = a.length;
        long sn = (n * (n + 1)) / 2; // sum of n number
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6; // sum of n integer square
        long sa = 0, s2a = 0;
        // finding sum of arr ele and square of ar ele
        for (int i = 0; i < n; i++) {
            sa += a[i];
            s2a += (long) a[i] * (long) a[i];
        }

        long x = sa - sn;
        long y = s2a - s2n;
        y = y / x; // we are calculating ovear all y value

        long X = (x + y) / 2; // we are repeating number by calculation
        long Y = X - x; // we are finding the missing from calculation

        return new int[] { (int) X, (int) Y };
        // time complexity : O(N) but here some chance to lossy data long to int

        /*
         * // Better Solution : Using Hashing
         * HashMap<Integer,Integer> hm = new HashMap<>();
         * int n = a.length ;
         * for(int i = 0 ; i < n ;i++){
         * hm.put(a[i],hm.getOrDefault(a[i],0)+1);
         * } // we insert all the value here as key and one of them is definatly
         * repeated so thats key stored as 2
         * // and that one number not stored here because of not containing in arry so
         * the key is not containng here
         * // if we iterate 1 to n and check for key is containg or not or what time
         * containg then we are able to find that both
         * 
         * int missing = -1 , repeating = -1 ;
         * for(int i = 1 ; i <= n ; i++){
         * if(!hm.containsKey(i)){
         * missing = i ; // this key is not containg in map so this is missing
         * }
         * else if(hm.get(i) == 2){ // where we get the value is 2 tht's key is
         * repeating
         * repeating = i ;
         * }
         * }
         * return new int[]{repeating, missing} ;
         * // time complexity : O(N+N) and space O(N) .
         * 
         * 
         */

        /*
         * HashMap<Integer,Integer> hm = new HashMap<>();
         * int n = a.length ;
         * for(int i = 1 ; i <= n ;i++){
         * hm.put(i,hm.getOrDefault(i,0)+a[i-1]);
         * }
         * 
         * int missing = -1 , repeating = -1 ;
         * for(Map.Entry<Integer,Integer> e : hm.entrySet()){
         * if(e.getValue() == 2) repeating = e.getKey() ;
         * else if(e.getValue() == 0) missing = e.getKey() ;
         * }
         * 
         * return new int[]{repeating,missing} ;
         * 
         * // time complexity : O(N+N) and space O(N) .
         * 
         * this way is not working well because of some incountering internal error
         * iff we are going to addd value of arr that is missing we are not exactly
         * inserting that
         */

        /*
         * // Brute force Solution
         * int missing = -1 , repeating = -1 ;
         * for(int i = 1 ; i <= a.length ;i++){
         * int count = 0 ;
         * for(int j = 0 ; j < a.length ; j++){
         * if(i == a[j]) count++ ;
         * }
         * if(count == 2) repeating = i ;
         * else if(count == 0) missing = i ;
         * 
         * else if(repeating != -1 && missing != -1) break ;
         * }
         * 
         * return new int[]{repeating,missing} ;
         * // Time Complexity : O(N^2) taken here
         * 
         */

    }
}