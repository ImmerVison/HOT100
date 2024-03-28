package io.goji.hot75.find_pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = i == 0 ? nums[i] : leftSum[i - 1] + nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[i] = i == nums.length - 1 ? nums[i] : rightSum[i + 1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;

    }
}
