import java.util.*;
public class ReverseOfArraybTL {
    public static void ReverseArray(int arr[]){
       int rev_arr[] = new int[5];  // create the same size new array and copy the reverse element it complexity in both time and space O(N)
       for(int i = 0 ; i < rev_arr.length ;i++){
           rev_arr[i] = arr[arr.length - 1 - i];
       }

       System.out.print("Reversed array after reversing :");
       for(int i = 0 ;i < rev_arr.length ;i++){
         System.out.print(rev_arr[i]+" ");
       }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array :");
        for(int i = 0 ;i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        ReverseArray(arr );

        sc.close();
    }
}
