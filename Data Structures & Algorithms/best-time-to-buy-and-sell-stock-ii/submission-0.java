class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length-1;
        int profit=0;
        for(int i =1;i<=n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
        
    }
}