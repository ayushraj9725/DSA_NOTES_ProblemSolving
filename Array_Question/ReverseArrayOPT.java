import java.util.*;
public class ReverseArrayOPT {
    public static void ReversedArr(int arr[]){
        // two pointer taking to reverse them ,here we solve it in O(n) time and O(1) space it is optimal
        int i = 0 ;
        int j = arr.length - 1 ;
        while(j > i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++ ;
            j-- ;
        }
        System.out.print("After reversing the array is :");
        for( i = 0 ;i < arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.print("Enter the array :");
    for(int i = 0 ;i < arr.length ;i++){
        arr[i] = sc.nextInt();
    }
    ReversedArr(arr);

    sc.close();
   }
}
