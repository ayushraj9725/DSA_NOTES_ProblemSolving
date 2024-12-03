import java.util.*;
public class BinearSearch {
    public static void BinarySearch(int arr[], int data){
        int i = 0 ;
        int j = arr.length - 1 ;
        int mid = i + (j - i)/2 ;
        while(j >= i){
        
          if(arr[mid] == data){
            System.out.println("The searched data index is :"+mid);
            break ;
          }
          else if(arr[mid] < data){
             i =  mid + 1 ;
          }
          else if(arr[mid] > data){
             j =  mid -1 ;
          }
          mid = i + (j - i)/2 ;
        }
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
        BinarySearch(arr , data);

        sc.close();
    }
    
}
