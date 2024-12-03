public class SecondLarMiniBetter {
    public static int SecondLargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE ;
        for(int i = 0 ;i< numbers.length ;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        for(int i = 0 ;i< numbers.length ;i++){
            if(numbers[i] > secondLargest && numbers[i] != largest ){
                secondLargest = numbers[i];
            }
        }
        return secondLargest ;
    
     }
     public static int SecondMinimestNum(int numbers[]){
        int smallest = Integer.MAX_VALUE ;
        int secondMinimest = Integer.MAX_VALUE ;
        for(int i =0 ;i< numbers.length ;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        for(int i =0 ;i< numbers.length ;i++){
            if(numbers[i] < secondMinimest  && numbers[i] != smallest){
                secondMinimest = numbers[i];
            }
        }
        return secondMinimest ;
     }
    public static void main(String args[]){
        // we are finding the second largest element in array 
        // brutal approach is that , first sort the array and then apply logic to access 2nd last element if sorted array in assending
        // otherwise access 2nd element in decending order 
        // here we apply the better approach to finding that time taken O(n + n)
        int numbers[] = {2, 5, 7, 10, 4, 8};
        
        System.out.println("Second minimest number is :"+SecondMinimestNum(numbers));
        System.out.println("Second Largest number is :"+SecondLargestNum(numbers));
    }
}
