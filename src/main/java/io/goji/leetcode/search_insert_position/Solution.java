package io.goji.leetcode.search_insert_position;

import java.util.Arrays;

public class Solution {

    public int searchInsert(int[] nums, int target) {


        int idx = Arrays.binarySearch(nums, target);
        if (idx < 0) {
            idx = -idx - 1;
        }
        return idx;
    }

}
