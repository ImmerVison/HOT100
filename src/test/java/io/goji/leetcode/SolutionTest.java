package io.goji.leetcode;


import io.goji.leetcode.house_robber.Solution;

public class SolutionTest {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        Solution solution = new Solution();
        int result = solution.rob(nums);
        System.out.println(result);
    }
}
