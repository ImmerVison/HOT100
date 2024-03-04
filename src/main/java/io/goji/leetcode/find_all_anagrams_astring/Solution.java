package io.goji.leetcode.find_all_anagrams_astring;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int winSize = p.length();
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }
        int l = 0, r = p.length() - 1;
        List<Integer> result = new ArrayList<>();
        while (r < s.length()) {
            if (isAnagram(pCount, s, l, r)) {
                result.add(l);
            }
            l++;
            r++;
        }
        return result;
    }


    public boolean isAnagram(int[] pCount, String s, int L, int R) {
        int[] temp = new int[26];
        for (int i = L; i <= R; i++) {
            temp[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] != pCount[i]) {
                return false;
            }
        }
        return true;
    }

}