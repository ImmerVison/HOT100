package io.goji.leetcode.decode_string;

public class Solution {
    public String decodeString(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                int j = i;
                while(Character.isDigit(s.charAt(j))) {
                    j++;
                }
                int k = Integer.parseInt(s.substring(i, j));
                int count = 1;
                int start = j + 1;
                while(count != 0) {
                    if(s.charAt(start) == '[') {
                        count++;
                    } else if(s.charAt(start) == ']') {
                        count--;
                    }
                    start++;
                }
                String sub = decodeString(s.substring(j + 1, start - 1));
                for(int l = 0; l < k; l++) {
                    sb.append(sub);
                }
                i = start;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
