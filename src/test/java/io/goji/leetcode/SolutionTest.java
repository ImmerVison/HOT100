package io.goji.leetcode;

import io.goji.leetcode.sliding_window_maximum.Solution;

public class SolutionTest {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = new Solution().maxSlidingWindow(nums, k);
    }
}
