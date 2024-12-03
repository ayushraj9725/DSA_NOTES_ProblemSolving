import java.util.HashSet;

class CheckDoubleOccure {
    public boolean checkIfExist(int[] arr) {
        /*
         * ArrayList<Integer> a = new ArrayList<>();
         * for(int i = 0 ; i < arr.length ;i++){
         * a.add(arr[i]);
         * }
         * // we have stored all value of arr element ]
         * // reiterating over here arr and check their double exist or not ;
         * for(int i = 0 ; i < arr.length ;i++){
         * int d = (2 * arr[i]) ; // double calculating
         * if(a.contains(d) || (arr[i] % 2 == 0 && a.contains(arr[i] / 2))) {
         * return true ;
         * }
         * }
         * return false ; // other wise return false at last if not exits any of ele of
         * double
         * 
         */
        // Create a HashSet for efficient lookup
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            // If double of the current element exists in the set, return true
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            // Add the current element to the set
            set.add(num);
        }

        return false; // If no such pair exists

    }
}