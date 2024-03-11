package io.goji.leetcode.top_k_frequent_elements;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
