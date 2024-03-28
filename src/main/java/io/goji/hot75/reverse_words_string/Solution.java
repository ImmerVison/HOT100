package io.goji.hot75.reverse_words_string;

import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");

        return Arrays.stream(s1)
            .filter(str -> !str.isEmpty())
            .reduce((a, b) -> b + " " + a)
            .orElse("");
    }
}
