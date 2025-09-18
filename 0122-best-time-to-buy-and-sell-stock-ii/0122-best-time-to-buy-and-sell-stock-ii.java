class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length-1;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<prices[i+1]){
                maxProfit += prices[i+1]-prices[i];
            }
        }
        return maxProfit;
        // int n=prices.length;
        // int profit=0;
        // for(int i=1;i<n;i++){
        //     if(prices[i]>prices[i-1]){
        //     profit +=  prices[i]- prices[i-1];
        //     }
        // }

        // return profit;
    }
}