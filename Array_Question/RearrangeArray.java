import java.util.*;
public class RearrangeArray {
    // optimal Approach in just 1 pass so O(N)
    public int[] rearrangeArray(int a[]){
    int n = a.length ;
    int temp[] = new int[n];

    int posindex = 0 ;
    int negindex = 1 ;

    for(int i = 0 ; i < n ; i++){
        if(a[i] > 0){
            if(posindex < n) {
               temp[posindex] = a[i] ;
               posindex= posindex+ 2 ;
            } 
        }
        else{
            if(negindex < n){
               temp[negindex] = a[i];
               negindex= negindex+2 ;
            }
        }
    }
    

    return temp ; // this is extra space for returning result 




  // Brute force type 2 , here we are taking 2 arry

/* here i am taking the advantage of even and odd index 
posArray index one by one going to even index of given arr
and negArray index element going one by one to given arr*/
/*
  int n = a.length ;
  int posArray[] = new int[n/2];
  int negArray[] = new int[n/2];
  int x = 0 , y = 0 ;
 
  for(int i = 0 ; i < n ;i++){ // O(N) time used
      if(a[i] > 0){
          posArray[x] = a[i] ;
          x++ ;
      }
      else{
          negArray[y] = a[i];
          y++ ;
      }
  }
  // right now we have separate pos and neg element 
  // now i am doing this things what is write above 

  for(int i = 0 ; i < n/2 ;i++){ // O(N) time used 
      a[i*2] = posArray[i];
      a[i*2 + 1] = negArray[i];
  }

  return a ;
  // over all time complexity = O(N + N)
  //overall space complexity = O(N) 

*/

// Most optimal solution 

/*
i am gonna use again to use even and odd index of array
how we use like this , start iterating and check element
is positive , then we move that element at right place that
is even and we made next space for same , otherwise we move 
that element at odd index of array

// what is did in brute 1 type solution just , i am going to 
reduce the n extra space 
*/

// int n =  a.length ;
// int eindex = 0 ;
// int oindex = 0 ;
// for(int i = 0 ; i < n ; i++){
//     if(a[i] > 0){
//         if(eindex < n){
//             a[eindex] = a[i] ;
//             eindex += 2 ;
//         }
//     }
//     else{
//         if(oindex < n){
//             a[oindex] = a[i];
//             oindex += 2 ;
//         }
//     }
// }

// return a ;
// do not do like this above 1 code is right




}
}