import java.util.Scanner;

public class maths17 {
    public static int Power(int x,int n){
		  int power ;
		power = (int)Math.pow(x,n);  // this are taking logn time and space O(1) but we manually do it   in java 
                                   // plz check once leetcode this problem there we did manually there 

		return power ; 


		
	}
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();

		System.out.println(Power(x,n));

		
        sc.close() ;
	}
}
