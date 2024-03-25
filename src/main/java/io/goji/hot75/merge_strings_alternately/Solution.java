package io.goji.hot75.merge_strings_alternately;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < word1.length() && ptr2 < word2.length()) {
            if (i % 2 == 0) {
                sb.append(word1.charAt(ptr1++));
            } else {
                sb.append(word2.charAt(ptr2++));
            }
            i++;
        }
        while (ptr1 < word1.length()) {
            sb.append(word1.charAt(ptr1++));
        }
        while (ptr2 < word2.length()) {
            sb.append(word2.charAt(ptr2++));
        }
        return sb.toString();
    }
}
