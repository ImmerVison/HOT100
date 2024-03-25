package io.goji.hot75.greatest_common_divisor_strings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }

        if(str1.startsWith(str2)) { // str2 is a prefix of str1, so remove str2 from str1
            if(str2.isEmpty()) { // str2 is the gcd of str1 and str2
                return str1;
            }
            return gcdOfStrings(str1.substring(str2.length()), str2); // remove str2 from str1
        } else {
            return "";
        }
    }
}
