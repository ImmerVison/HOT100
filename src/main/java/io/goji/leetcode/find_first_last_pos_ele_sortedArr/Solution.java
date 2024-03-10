package io.goji.leetcode.find_first_last_pos_ele_sortedArr;

import java.util.Arrays;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        if(idx < 0) {
            return new int[]{-1, -1};
        }
        int start = idx;
        int end = idx;
        while(start > 0 && nums[start - 1] == target) {
            start--;
        }
        while(end < nums.length - 1 && nums[end + 1] == target) {
            end++;
        }
        return new int[]{start, end};
    }

}
