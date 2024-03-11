package io.goji.leetcode.besttime_buy_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(0, dp[i - 1] + prices[i] - prices[i - 1]);
            maxProfit = Math.max(maxProfit, dp[i]);
        }
        return maxProfit;
    }
}
