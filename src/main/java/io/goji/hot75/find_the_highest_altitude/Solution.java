package io.goji.hot75.find_the_highest_altitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i : gain) {
            current += i;
            max = Math.max(max, current);
        }
        return max;

    }
}
