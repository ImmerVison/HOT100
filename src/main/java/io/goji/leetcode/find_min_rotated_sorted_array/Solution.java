package io.goji.leetcode.find_min_rotated_sorted_array;

import java.util.Arrays;

public class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
