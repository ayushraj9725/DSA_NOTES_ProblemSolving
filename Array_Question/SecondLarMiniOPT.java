public class SecondLarMiniOPT {
    public static int SecondLargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE ;
        for(int i = 0 ;i< numbers.length ;i++){
            if(numbers[i] > largest){
                secondLargest = largest ;
                largest = numbers[i];
            }
            else if(numbers[i] < largest && numbers[i] > secondLargest){
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
                secondMinimest = smallest ;
                smallest = numbers[i];
            }
            else if(numbers[i] > smallest && numbers[i] < secondMinimest){
                secondMinimest = numbers[i];
            }
        }
        
        return secondMinimest ;
     }
    public static void main(String args[]){
        // finding the second largest and minimest number in array using OPTIMAL approach in O(N) time and O(1) space

        int numbers[] = {2, 5, 7, 10, 4, 8};

        System.out.println("Second minimest number is :"+SecondMinimestNum(numbers));
        System.out.println("Second Largest number is :"+SecondLargestNum(numbers));

    }
}
