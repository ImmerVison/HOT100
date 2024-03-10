package io.goji.leetcode.search_rotated_sorted_array;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        int[][] pair = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> a[0] - b[0]);
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(pair[mid][0] == target) {
                return pair[mid][1];
            } else if(pair[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
