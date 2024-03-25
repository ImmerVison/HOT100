package io.goji.leetcode.longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int maxLen = 0;
        int start = 0;
        for(int d = 0; d < len; d++) {
            for(int i = 0; i + d < len; i++) {
                int j = i + d;
                if(s.charAt(i) == s.charAt(j)) {
                    if(d == 0 || d == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j] && d + 1 > maxLen) {
                    maxLen = d + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
