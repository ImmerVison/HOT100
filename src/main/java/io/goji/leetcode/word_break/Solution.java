package io.goji.leetcode.word_break;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];//dp[i] means s.substring(0, i) can be segmented into words in the wordDict
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (!dp[i]) {
                continue;
            }
            for (String word : wordDict) {
                int end = i + word.length();
                if (end <= s.length() && s.substring(i, end).equals(word)) {
                    dp[end] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
