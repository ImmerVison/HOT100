package io.goji.leetcode.subarray_sum_equalsK;

public class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
       int[] preSum = new int[nums.length + 1];
         preSum[0] = 0;
         for (int i = 1; i <= nums.length; i++) {
             if(nums[i - 1] == k) count++;
             preSum[i] = preSum[i - 1] + nums[i - 1];
         }
         int l = 1; int r = 2;
         for(int i = 1; i <= nums.length; i++){
             for(int j = i + 1; j <= nums.length; j++){
                 if(preSum[j] - preSum[i - 1] == k) count++;
             }
         }
         return count;
    }
}
