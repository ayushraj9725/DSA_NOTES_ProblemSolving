
public class PassingArrayInfun {
    public static void Update(int marks[], int sub){
        sub = 5 ; 
        for(int i= 0 ;i< marks.length;i++){
            marks[i] =marks[i] + 1 ; // marks are updating 
        }
    }
    public static void main(String[] args){
         int marks[] = {97,98,99}; // size by default define in java
         int subject = 3 ;
         //before updating 
         System.out.println(subject);
         for(int i = 0; i < marks.length;i++){
            System.out.print(marks[i] +" ");
         }
         System.out.println();
         

         Update(marks,subject); // passing actual parameters to function or calling to updatr function
         // PassingArrayInfun.Update(marks,subject); we can call like this also this time   
                                   
         // after updating result 
         System.out.println(subject);  // subject is not updating because it is passed as value parameter 
         for(int i = 0; i < marks.length;i++){
            System.out.print(marks[i] +" "); // marks are changing because it passed as reference parameter bydefaultly 
         }
         System.out.println();

    }
}
