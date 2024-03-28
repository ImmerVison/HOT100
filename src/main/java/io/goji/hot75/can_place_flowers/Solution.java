package io.goji.hot75.can_place_flowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(flowerbed[i] == 0) {
                int prev = i == 0 ? 0 : flowerbed[i - 1];
                int next = i == len - 1 ? 0 : flowerbed[i + 1];
                if(prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
