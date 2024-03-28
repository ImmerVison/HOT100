package io.goji.hot75.product_array_except_self;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftAcc = new int[nums.length - 1];
        int[] rightAcc = new int[nums.length - 1];
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length - 1; i++) {
            leftAcc[i] = i == 0 ? nums[i] : leftAcc[i - 1] * nums[i];
        }
        for(int i = nums.length - 1; i > 0; i--) {
            rightAcc[i - 1] = i == nums.length - 1 ? nums[i] : rightAcc[i] * nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            result[i] = (i == 0 ? 1 : leftAcc[i - 1]) * (i == nums.length - 1 ? 1 : rightAcc[i]);
        }
        return result;
    }
}
