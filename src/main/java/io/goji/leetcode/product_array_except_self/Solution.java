package io.goji.leetcode.product_array_except_self;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] dpLeft = new int[nums.length];
       int[] dpRight = new int[nums.length];
       dpLeft[0] = 1;
       dpRight[nums.length - 1] = 1;
       for (int i = 1; i < nums.length; i++) {
              dpLeft[i] = dpLeft[i - 1] * nums[i - 1];
       }
       for (int i = nums.length - 2; i >= 0; i--) {
           dpRight[i] = dpRight[i + 1] * nums[i + 1];
       }
       int[] result = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
        result[i] = dpLeft[i] * dpRight[i];
       }
        return result;
    }

}
