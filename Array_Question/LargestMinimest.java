public class LargestMinimest {  //optimal approach
    public static int LargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE ;
        for(int i = 0 ;i< numbers.length ;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
         return largest ;
     }
     public static int MinimestNum(int numbers[]){
        int smallest = Integer.MAX_VALUE ;
        for(int i =0 ;i< numbers.length ;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest ;
     }

    // 2nd optimal way 
     public static void FindLM(int numbers[]){
        int largest = numbers[0];
        int minimest = numbers[0] ;
        for(int i= 0; i< numbers.length ;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            else{
                if(minimest > numbers[i])
                {
                    minimest = numbers[i];
                }
            }
        }
        System.out.println("largest :"+largest);
        System.out.println("minimest :"+minimest);
     }
    public static void main(String args[]){
        int numbers[] = {2, 5, 8, 10, 1, 3, 4};

        System.out.println("The Largest number is :"+LargestNum(numbers));
        System.out.println("The Smallest number is :"+MinimestNum(numbers));
       //FindLM(numbers);
    }
}
