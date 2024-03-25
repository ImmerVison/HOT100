package io.goji.leetcode.letter_combinations_phone;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = new String[] {
               "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        backtrack(result, digits, mapping, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String digits, String[] mapping, int index, StringBuilder sb) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '2'];
        for(int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(result, digits, mapping, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


}
