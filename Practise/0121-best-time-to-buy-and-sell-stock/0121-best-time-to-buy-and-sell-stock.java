class Solution {
    public int maxProfit(int[] prices) {
        int currMinStock = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++)
        {
            currMinStock = Math.min(prices[i],currMinStock);
            int profit = prices[i]-currMinStock;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}