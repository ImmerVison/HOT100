package io.goji.leetcode.lcs;

public class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        char[] chs1 = str1.toCharArray(), chs2 = str2.toCharArray();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            char c1 = chs1[i - 1];
            for (int j = 1; j <= n; ++j) {
                char c2 = chs2[j - 1];
                if (c1 == c2) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
}
