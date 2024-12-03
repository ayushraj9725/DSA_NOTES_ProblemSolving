//import java.util.*;

public class CreatArray{
     public static void main(String[] args){
        //int arr1[] = new int[50]; // creating an array in java using new keyword which providing space or plote in memory 
        

       // int[] arr = {2,3,4};  // this is also way of creating array
       // int[] arr1 = new int[0];

        int arr2[] = {2,4,6};
        for(int i=0 ;i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        } 
        System.out.println();


        String fruits[] = {"apple ", "banana", "cherry"};
        for(int i=0 ;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
     }
}