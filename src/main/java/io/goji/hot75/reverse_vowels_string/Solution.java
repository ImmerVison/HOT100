package io.goji.hot75.reverse_vowels_string;

public class Solution {
    public String reverseVowels(String s) {

    char[] arr = s.toCharArray();

    int l = 0;
    int r = arr.length - 1;

    while (l < r) {
        if (!isVowel(arr[l])) {
            l++;
            continue;
        }
        if (!isVowel(arr[r])) {
            r--;
            continue;
        }
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
    }

    return new String(arr);

}


private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}


}
