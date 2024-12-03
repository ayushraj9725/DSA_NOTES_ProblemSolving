//import java.util.*;
public class maths3 {
    public static long sumOrProduct(int n, int q) {

		// according to question we are doing this thing  , we are writing only mehtod not print here , if we need it ,than we will do
		int sum = 0 ; 
		long product = 1 ;
		int mod = 1000000007 ;  
		if(q == 1){
			for(int i = 1 ;i<= n ;i++){
               sum = sum + i ;
			}
			return sum ;
		}
		else if(q == 2){
			for(int i = 1 ;i<= n;i++){
				product = (product*i)%mod ;
			}
		}
		return product ;
    }
        public static void main(String args[]){

        }
}
