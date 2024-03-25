package io.goji.leetcode;


import io.goji.leetcode.coin_change.Solution;

public class SolutionTest {
    public static void main(String[] args) {

        int[] nums = {2};

        Solution solution = new Solution();
        int result = solution.coinChange(nums, 3);
        System.out.println(result);
    }
}
