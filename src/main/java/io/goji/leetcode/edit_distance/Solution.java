package io.goji.leetcode.edit_distance;

public class Solution {
    //todo 又忘记了
    public int minDistance(String word1, String word2) {
        int[] dp = new int[word2.length() + 1];
        for(int i = 0; i <= word1.length(); i++) {
            int[] next = new int[word2.length() + 1];
            for(int j = 0; j <= word2.length(); j++) {
                if(i == 0) {
                    next[j] = j;
                } else if(j == 0) {
                    next[j] = i;
                } else if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    next[j] = dp[j - 1];
                } else {
                    next[j] = Math.min(dp[j - 1], Math.min(dp[j], next[j - 1])) + 1;
                }
            }
            dp = next;
        }
        return dp[word2.length()];

    }
}
