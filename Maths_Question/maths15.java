public class maths15 {
    public static void factorial(int n) {
		// Write your code here
		long fact = 1 ;
		if(n < 0){
			System.out.println("factorial not defined");

		}
		else if( n == 0){
			System.out.println("1");
		}

		else {
			if(n > 1){
				for(int i = n ;i >= 1 ;i--)
				fact = fact * i ;
			}
			System.out.println(fact);
		}
		
	}
}
