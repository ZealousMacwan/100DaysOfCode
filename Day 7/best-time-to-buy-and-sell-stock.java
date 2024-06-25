// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int currentMax = 0;
        int maxProfit = 0;
        // as mentioned in q, that we can only sell 
        // after we buy, means we go in reverse order
        // keep track of highest price we have seen
        // and find profit in each step with that highest price
        for(int i=prices.length-1; i>=0; i--){
            currentMax = Math.max(currentMax, prices[i]);
            int currentProfit = currentMax - prices[i];
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}