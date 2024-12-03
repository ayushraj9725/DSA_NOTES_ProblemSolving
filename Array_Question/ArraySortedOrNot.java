public class ArraySortedOrNot {
    public static int isSorted(int n, int []a) {
        // Write your code here.
       /*  for(int i = 0 ;i< n; i++){
            if(a[i] <= a[i+1] ){  // here the issue is out of bound  
                return 1 ;
            }
        }
        return 0 ; */
        //correct way is this

        for(int i = 0 ; i< n-1 ;i++){
            if(a[i] >= a[i+1]){
                return 0 ; // if array is not sorted in that mean array is found non - decreasing order
                          // we false it initially not return 1 ,so that bcz if any two consecutive no is non decreasing order then that 
                          // mean the determine entire array is not sorted   so we do it false return first 
            }
        }
        return 1 ; // array is insreasing order
    }
        // second way is this
        /* for(int i = 1 ;i< n ;i++){
            if(a[i] <= a[i-1]){
                return 0 ;
            }
        }
        return 1 ;
    } */
    public static void main(String args[]){
        int n = 5;
        int arr[] = {4,5,4,4,4};

        System.out.println(isSorted(n , arr));
    }
}
