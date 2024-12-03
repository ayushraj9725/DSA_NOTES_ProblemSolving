public class LeadersInArray2 {
    public int[] replaceElements(int[] arr) {
       
        //  creating an aray for return result 
           int result[] = new int[arr.length];
           
           result[arr.length - 1] = -1 ; // result always start from -1
           int max = arr[arr.length - 1];
   
           for(int i = arr.length - 2 ;i >= 0 ;i--){
                 result[i] = max ;    // adding each time what is max 
                 max = Math.max(max,arr[i]); // max updating 
               
           }
           return result ;
   
           // time complexity here O(N) and space is O(N) but space is not considerd 
       }
}
