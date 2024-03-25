package io.goji.leetcode.palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtrack(result, list, s, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> list, String s, int start) {
        if(start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < s.length(); i++) {
            if(isPalindrome(s, start, i)) {
                list.add(s.substring(start, i + 1));
                backtrack(result, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

}
