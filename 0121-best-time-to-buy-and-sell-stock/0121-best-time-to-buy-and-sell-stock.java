class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit=0;
        int buyPrice = prices[0];
        for(int i=1;i<n;i++){
            int currProfit = prices[i] - buyPrice;
            if(currProfit>maxProfit){
                maxProfit = currProfit;
            }
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
        }
        return maxProfit;
        // int n=prices.length;
        // int buyPrice = prices[0];
        // int profit=0;
        // for(int i=1;i<n;i++){
        //     if(buyPrice>prices[i]){
        //         buyPrice=prices[i];
        //     }
        //     profit = Math.max(profit, prices[i]- buyPrice);
        // }

        // return profit;
    }
}