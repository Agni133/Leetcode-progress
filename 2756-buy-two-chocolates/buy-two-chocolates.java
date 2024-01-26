class Solution {
    public int buyChoco(int[] prices, int money) {   
       
        int minprice= Integer.MAX_VALUE;

            for(int i=0;i<prices.length;i++){


                for(int j=i+1;j<prices.length;j++){
                                   
                    int cost = prices[i] + prices[j];

                            //  condition for buying chocolate 
                    if(cost<minprice){

                        minprice = cost;
                    }

                }
            }

           if(minprice <=money){
                        // leftover money we have after buying chocolate 
               return money-minprice;
           }else{
                        //  if we dont have enough money for buying chocolate return the same amount of money 
               return money;
           }

        
    }
}