package minimum_window_substring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        while (right < s.length()) {
            sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right), 0) + 1);
            while (contains(sMap, tMap)) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }
                sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
        ///TODO: Implement the solution
    }



    public boolean contains(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            if (sMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }



}
