package io.goji.leetcode.longest_valid_parentheses;

public class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        int[] dp = new int[s.length()]; // dp[i] represents the length of the longest valid substring ending at i
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') { // if the current character is ')',
                if (s.charAt(i - 1) == '(') { // if the previous character is '(',
                    // then we can extend the valid substring ending at i - 1 to i, so
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2; // dp[i] = dp[i - 2] + 2, if i >= 2, otherwise dp[i] = 2,
                    // because the valid substring ending at i - 1 is "()"
                    // and we can extend it to "()", so the length of the valid substring ending at i is 2
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') { // if the previous character is ')'
                    // and there is a valid substring ending at i - 1,
                    // and the character before the valid substring is '(',
                    // then we can extend the valid substring ending at i - 1 to i,
                    // so dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2],
                    dp[i] = dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;

    }
}
