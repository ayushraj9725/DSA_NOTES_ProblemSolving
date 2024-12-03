import java.util.*;
public class BinarySearch {
    public static int BinarySearching(int arr[], int data){
        int i = 0 ;
        int j = arr.length - 1 ;

        while(j >= i){
            int mid = i + (j - i)/2 ;

          if(arr[mid] == data){
              return mid ; 
          }
          else if(arr[mid] < data){
             i =  mid + 1 ;
          }
          else 
             j =  mid -1 ;
        }
        return -1 ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter your sorted array : ");
        for(int i = 0 ;i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enetr your data you want to search : ");
        int data = sc.nextInt();

        // we are passing the parameters
       int result = BinarySearching(arr , data);
       if(result == -1){
        System.out.println("Index is not found because data not searched !");
       }
       else{
        System.out.println("Data is searched so index is of the data "+result);
       }
        sc.close();
    }
    
}

