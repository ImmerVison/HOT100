package io.goji.leetcode.first_missing_positive;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int result = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == result) {
                result++;
            }
            map.put(nums[i], i);
        }
        while (map.containsKey(result)) {
            result++;
        }
        return result;

    }
}
