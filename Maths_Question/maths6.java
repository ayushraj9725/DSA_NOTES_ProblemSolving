import java.util.Scanner;

public class maths6 {
    public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

        int esum = 0 ;
		int osum = 0 ;
		while(n != 0){
			int d = n % 10 ;
			if(d % 2 == 0){
				esum = esum + d ;
			}
			else{
				osum = osum + d ;
			}

			n = n/10 ;
		}

     System.out.println(esum+" "+osum);
	 sc.close();
	}
}
