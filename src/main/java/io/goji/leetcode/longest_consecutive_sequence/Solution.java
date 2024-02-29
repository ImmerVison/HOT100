package io.goji.leetcode.longest_consecutive_sequence;

import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int count = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                count++;
                max = Math.max(max, count);
            } else if(nums[i] - nums[i-1] == 0){
                continue;
            } else {
                count = 1;
            }
        }
        return nums.length == 0 ? 0 : max;
    }
}


