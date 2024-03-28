package io.goji.hot75.unique_number_occurrences;

import java.util.Arrays;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size() == Arrays.stream(arr).map(map::get).distinct().count();
    }
}
