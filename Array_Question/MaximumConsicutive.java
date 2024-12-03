public class MaximumConsicutive {
    public static int consecutiveOnes(int n, int[] arr) {
		int maxi = 0 ;
		int count = 0 ;
		for(int i = 0 ; i < n ;i++){
			if(arr[i] == 1){
				count++ ;
				maxi = Math.max(maxi,count);
			}
			else {
				count = 0 ;
			}
		}

		return maxi ; // used O(n) time and constant space O(1
    }
}
