import java.util.ArrayList;
import java.util.List;

public class unionTwoSorted {
     public static List< Integer > sortedArray(int []a, int []b) {
      /*  Set<Integer> s = new TreeSet<>();   // O(n) space 
        for(int i = 0 ; i < a.length ; i++){ // O(n) time , but internally set taking O(logn)
            s.add(a[i]);
        }
        for(int i = 0 ; i < b.length ; i++){ //O(n) time
            s.add(b[i]);
        }

        List<Integer> l = new ArrayList<>(s);// O(n) space is taken , use for return result

        return l ; //overall O(2n) time space taken   */

        int n1 = a.length ;
        int n2 = b.length ;
        int i = 0 ;
        int j = 0 ;
        List<Integer> l = new ArrayList<>();
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(l.size() == 0 || l.get(l.size()-1) != a[i]){
                    l.add(a[i]);
                }
                i++ ;
            }
            else{
                if(l.size() == 0 || l.get(l.size()-1) != b[j]){
                    l.add(b[j]);
                }
                j++ ;
            }
        }
        while(i < n1){
            if(l.size() == 0 || l.get(l.size()-1) != a[i]){
                    l.add(a[i]);
                }
                i++ ;
        }
        while(j < n2){
            if(l.size() == 0 || l.get(l.size()-1) != b[j]){
                    l.add(b[j]);
                }
                j++ ;
        }
       return l ; // optimal approach 
       // time complexity O(n+n) because we iterate entire both array
       // space is not using list is using for returning the result 



    }
}
