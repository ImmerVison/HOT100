package io.goji.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        result[0] = map.get(complement);
        result[1] = i;
        return result;
      }
      map.put(nums[i], i);
    }
    return result;
  }
}
