import java.util.ArrayList;

class BestTimeTOBuy1 {
     public static int maximumProfit(ArrayList<Integer> prices){
            // Brute Force Method  
/*
            int max = 0 ;
            int min = Collections.min(prices);

            for(int i = 0 ;i < prices.size() ; i++){
                
                for(int j = i + 1  ; j < prices.size() ; j++){
                     
                     int profit = prices.get(j) - prices.get(i) ;

                     if(profit > max){
                         max = profit ;
                     }
                }
            }

            return max ; //  to calculate it we have to check every time profit 
            //time complexity used here O(N^2) no space used here 
   */

        // most Optimal Solutiion using Dynamic Programming (kadane's algo)
        int buy_price = prices.get(0) ;

        int maxProfit = 0 ;
        for(int i = 1 ; i < prices.size() ; i++){
            //updating buy_price to see less stock value
            if(buy_price > prices.get(i)){
                buy_price = prices.get(i) ;
            }
            // calculating each time price so 

            int currentProfit = prices.get(i) - buy_price ;

            // here checking if currentProfit more than maxProfit or not if yes then update 
             maxProfit = Math.max(maxProfit,currentProfit);


        }
        
         return maxProfit ;













    }
}