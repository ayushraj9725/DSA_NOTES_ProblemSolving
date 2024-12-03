public class MinimizeGasStations {
     public static int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length; // size of the array
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
    public static double MinimiseMaxDistance(int []arr, int K){

      // binary search Optimal approach ;
       int n = arr.length; // size of the array
        double low = 0,  high = 0;
        //Find the maximum distance:
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i]));
        }
        //Apply Binary search:
        double diff = 1e-6 ;
        while (high - low > diff) {
            double mid = (low + high) / (2.0);
            int cnt = numberOfGasStationsRequired(mid, arr);
            if (cnt > K) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;











      /*  // Brute force solution 
        int n = arr.length ;
        int howMany[] = new int[n-1] ; // making an gap array which will help me to find the gap and how i achive the minimization of distance while fitting given gas stations
        for(int stations = 1 ; stations <= K ; stations++){
            double maxSection = -1 ;
            int maxInd = -1 ;
            for(int i = 0 ; i < n - 1 ;i++){
                double diff = arr[i+1] - arr[i];
                double sectionLen = diff/(double)(howMany[i]+1) ; // the sectionLength we are finding so the we can konw how many gas station are fitting between any two gas station with same equal distance
                if(sectionLen > maxSection){
                    maxSection = sectionLen; 
                    maxInd = i ; // it hold the station fixing in between two gas station , it gonna set into gap array
                }
            }
            howMany[maxInd]++ ; // here increment that index where we find the max distance gap / section 
        }

        // now we are reiterating the given arr and find the maximum length using gap we find in array howMany
        double maxDis = -1 ;
        for(int i = 0 ; i < n-1 ;i++){
            double diff = arr[i+1] - arr[i];
            double sectonLen = diff/(double)(howMany[i]+1);
            maxDis = Math.max(maxDis,sectonLen);
        }
        return maxDis ; // here the get maximum distance that is minimized from maximum

        */

       

    }
}
