package io.goji.leetcode.longest_substring_without_char;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
         int len = s.length();
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i < len; i++) {
            int j = i - 1;
            while(j >= i - dp[i - 1] && s.charAt(j) != s.charAt(i)) {
                j--;
            }
            dp[i] = i - j;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
