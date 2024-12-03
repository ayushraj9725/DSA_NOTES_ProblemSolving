public class KthLargestElementSorted {

    public double findK(int[] a1, int[] a2, int k) {
        //Ensure a1 is the smaller array to apply binary search on the smaller array
        if(a1.length > a2.length) {
            return findK(a2, a1,k);
        }

        int n1 = a1.length;
        int n2 = a2.length;
        int low = Math.max(0,k - n2); //because we need atleast k - n2 to be elements from a1
        int high = Math.min(k,n1); //goal is to find k only, so take minimum from k and n1 for a1
        int left = k;

        while(low <= high) {  //all this conditions are same
            int cut1 = (low + high) / 2; //mid1
            int cut2 = left - cut1; //mid2

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : a2[cut2 - 1];

            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : a1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : a2[cut2];

            //Check if we found the correct partition
            if(l1 <= r2 && l2 <= r1) {
                if((n1 + n2) % 2 == 0) {
                    return Math.max(l1, l2); //returning kth element
            }
            else if(l1 > r2) {
                //Move towards the left in the first array
                high = cut1 - 1;
            }
            else{ //l2 > r1
                //Move towards the right in the first array
                low = cut1 + 1;
            }
        }
        }
        return 0.0; // Fallback, this should never be reached if input is valid
    
    }
}