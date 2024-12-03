public class maths5 {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Convert arrays to strings
       StringBuilder num1 = new StringBuilder();
       for (int digit : a) {
           num1.append(digit);
       }

       StringBuilder num2 = new StringBuilder();
       for (int digit : b) {
           num2.append(digit);
       }

       // Convert strings to integers
       long int1 = Long.parseLong(num1.toString());
       long int2 = Long.parseLong(num2.toString());

       // Sum the two integers
       long total = int1 + int2;

       // Convert the sum back to an array of digits
       String totalStr = Long.toString(total);

       // string into array form to store numerical value into aray form
       int[] result = new int[totalStr.length()];
       for (int i = 0; i < totalStr.length(); i++) {
           result[i] = Character.getNumericValue(totalStr.charAt(i));
       }

       return result; 
      /* // this code it applicabe for same size addition arrayu
       int []c = new int[n];

       for(int i = 0;i< n ;i++){
           c[i] = a[i] + b[i] ;
       }
       return c ; */
   }
}
