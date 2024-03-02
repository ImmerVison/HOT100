package io.goji.leetcode.sum3;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length - 2; i++) {
            int f1 = nums[i];
            int target = -f1;
            for (int j = i + 1; j < nums.length; j++) {
                int f2 = nums[j];
                int f3 = target - f2;
                if (map.containsKey(f3) && map.get(f3) > j) {
                    result.add(Arrays.asList(f1, f2, f3));
                }
            }
        }
        return result.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
}
