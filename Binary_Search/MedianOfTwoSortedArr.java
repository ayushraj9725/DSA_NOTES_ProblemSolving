public class MedianOfTwoSortedArr {

    public static double median(int[] a, int[] b) {
    // Optimal Solution : Binary search
    int n1 = a.length, n2 = b.length;
   // int n = n1 + n2 ;
    // if n1 is bigger swap the arrays:
    if(n1>n2) return median(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;



    /*	int i = 0 , j = 0 ;
        int n1 = a.length , n2 = b.length ;
        int n = (n1 + n2) ;
        int ind2 = n/2 ;
        int ind1 = (n-1)/2 ; // this is both actually what we need for that two elemt
        int cnt = 0 ;
        double median = 0 ;
        int indele1 = -1 , indele2 = -1 ; // this is that two element we are looking for 
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                if(cnt == ind1) indele1 = a[i];
                if(cnt == ind2) indele2 = a[i];
                cnt++;
                i++ ;
            }
            else{
                if(cnt == ind1) indele1 = b[j];
                if(cnt == ind2) indele2 = b[j];
                cnt++;
                j++ ;
            }
          if(cnt > ind2) break ; // this is breaking point where we get both number of arr what we required 
        }
        while(i < n1){
                if(cnt == ind1) indele1 = a[i];
                if(cnt == ind2) indele2 = a[i];
                cnt++;
                i++ ;
                 if(cnt > ind2) break ;
        }
        while(j < n2){
                if(cnt == ind1) indele1 = b[j];
                if(cnt == ind2) indele2 = b[j];
                cnt++;
                j++ ;
                 if(cnt > ind2) break ;
        }
        if(n % 2 == 1) median = indele2 ; //if size is odd then n/2 ind elemt is our answer 
        else{
            median = (double)((double)(indele1 + indele2)/2.0) ;
        }

        return median ; // time complexity : O(N1 + N2) in worth case , if we want to more optimized then we can do logic where we find both element then we will stop
        
        */

    }
}
