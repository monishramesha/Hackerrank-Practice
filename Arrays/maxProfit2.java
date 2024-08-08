class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int flag = prices[0];
        for(int i=1; i<len; i++){
            if(flag < prices[i]) profit += prices[i] - flag;
            flag = prices[i];
        }
        return profit;
    }
}
