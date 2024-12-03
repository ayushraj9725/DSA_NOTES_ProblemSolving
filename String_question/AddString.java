public class AddString {
    /* public String addStrings(String num1, String num2) {
     StringBuilder str = new StringBuilder() ;

        int i = num1.length() - 1 ;
        int j = num2.length() - 1 ;
        int c = 0 ; // for storing carry 
        while( i>=0 || j>=0){
            int sum = 0 , c1 = 0 ,c2 = 0 ;
            if(i>=0){
                c1 = num1.charAt(i) - '0'; // treat like ascii 
               i-- ;
            }
            if(j>=0){
                c2 = num2.charAt(j) - '0'; 
               j-- ;
            }
                sum = c + c1 + c2 ;
            if(sum >= 10){
                c = 1 ;
                sum = sum - 10 ;
            }
            else
                c = 0 ;
                str.append(sum) ;
        }
        if(c == 1)
            str.append(c) ; // if any carry save that is only 1 we append it at last

            return str.reverse().toString() ;  // taking O(max(n,m)) space and time both n - length of num1 and m for num2

            */

            public String addStrings(String num1, String num2) {

                StringBuilder result = new StringBuilder() ;
                int i = num1.length() - 1 , j = num2.length() - 1 ;
                int carry =  0 ;
   
                while(i >= 0 || j >= 0 || carry != 0){
                   int c1 = (i >= 0) ? num1.charAt(i) - '0' : 0 ;
                   int c2 = (j >= 0) ? num2.charAt(j) - '0' : 0 ;
                   int sum = c1 + c2 + carry ;
   
                   result.append(sum % 10) ;
                   carry = sum/10 ;
                   i-- ;
                   j-- ;
                }
   
               return  result.reverse().toString() ; 
       }    // taking same time and space O(Max(n,m)) n ,m size of num1 and num2 respectivly
}
