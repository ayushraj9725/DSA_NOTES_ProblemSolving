import java.util.Scanner;

public class maths11 {
    public static boolean isPrime(int j){
		for(int i = 2 ;i<=Math.sqrt(j) ; i++){
			if(j % i == 0){
				return false ;
			}
			
		}
		return true ;
	}
    public static void primeNumberInRange(int n){
		//List<Integer> primes = new  ArrayList<>();
		for(int i = 2 ; i<= n ;i++){
			if(isPrime(i)){
			   System.out.println(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();

	   primeNumberInRange(n);
		sc.close() ;
	}
}
