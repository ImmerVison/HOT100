package io.goji.leetcode.jump_game;

public class Solution {

    public boolean canJump(int[] nums) {
        ///TODO: Implement the solution
        int nextIdx = 0;
        while (nextIdx < nums.length - 1) {
            if (nums[nextIdx] == 0) {
                return false;
            }
            nextIdx += nums[nextIdx];
        }
        return nextIdx >= nums.length - 1;

    }
}
