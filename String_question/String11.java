import java.util.Scanner;

public class String11 {
    static String reverseStringWordWise(String input) {
        
        String s[] = input.split(" ");
        int i = 0 ;
        int j = s.length - 1 ;
        while(i < j){
            String t = s[i] ;
            s[i] = s[j] ;
            s[j] = t ;
            i++ ;
            j-- ;
        }
        return String.join(" ",s);
    }   
      /* time complexity is this case O(N)
      Splitting the string into words: O(n) where n is the length of the input string.
      Reversing the array: O(m) where m is the number of words in the input.
      Joining the words back into a string: O(n) where n is the length of the input string.
       Space Complexity - The space complexity is O(n) for storing the split words and the reversed result.*/
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
       sc.close();
    }
}
