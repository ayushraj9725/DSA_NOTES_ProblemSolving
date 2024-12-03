import java.util.Scanner;

public class maths9 {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        int arr[] = new int[n];
		int sum = 0 ;

		for(int i = 0 ;i <n ;i++ ){
           arr[i] = sc.nextInt();
		}

		for(int i = 0 ;i<n; i++){
			sum = sum + arr[i];
		}

		System.out.println(sum);
		sc.close();
	}
}
