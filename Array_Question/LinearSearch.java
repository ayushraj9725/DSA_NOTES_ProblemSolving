import java.util.*;
public class LinearSearch {
    public static int LinearSearching(int arr[],int data){
    
        for( int i = 0 ;i < arr.length ; i++){
            if(arr[i] == data){
               return i ;
            }
        }

        return -1 ; // it show that index not present if the index is not found then it work
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your data what tou want to search : ");
        int data = sc.nextInt();
        
        // passing parameter in function 

        int index = LinearSearching(arr ,data );

        
        System.out.println("The index of the searched element :"+index);

        sc.close();
    }
}
