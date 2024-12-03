import java.util.*;
public class IntersectionOfTwoSortedarr {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
	/*	ArrayList<Integer> result = new ArrayList<>();
		int vis[] = new int[m];
		Arrays.fill(vis,0) ; // n space is using 

		for(int i = 0 ; i < n ; i++){ // n time
			for(int j = 0 ; j < m ; j++){ // n time 
				if(arr1.get(i) == arr2.get(j) && vis[j] == 0){
					result.add(arr1.get(i));
					vis[j] = 1 ;
					break ;
				}
				if(arr2.get(j) > arr1.get(i)) break ; // here we are checking for if greater element found in arr2 then we do not check
			}
		}

		return result ;       */


		ArrayList<Integer> result = new ArrayList<>();
		int i = 0 ;
		int j = 0 ;
        
		while(i < n && j < m ){
           if(arr1.get(i) < arr2.get(j)){
			   i++ ;
		   }
		   else if(arr1.get(i) > arr2.get(j)){
			   j++ ;
		   }
		   else {
			   result.add(arr1.get(i));
			   i++ ;
			   j++ ;
		   }
		}

        return result ; // time complexity overall O(n+m)

	}
}
