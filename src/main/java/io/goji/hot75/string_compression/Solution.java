package io.goji.hot75.string_compression;

public class Solution {
    public int compress(char[] chars) {

        int ptr = 0;

        for(int i = 0; i < chars.length; i++) {
            int count = 1;
            while(i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[ptr++] = chars[i];
            if(count > 1) {
                for(char c : Integer.toString(count).toCharArray()) {
                    chars[ptr++] = c;
                }
            }
        }
        return ptr;
    }
}
