package io.goji.leetcode.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums){
        int zeroIndex = 0;
        int nonZeroIndex = 0;
        while (zeroIndex < nums.length && nonZeroIndex < nums.length){
            while (zeroIndex < nums.length && nums[zeroIndex] != 0){
                zeroIndex++;
            }
            nonZeroIndex = zeroIndex;
            while (nonZeroIndex < nums.length && nums[nonZeroIndex] == 0){
                nonZeroIndex++;
            }
            if (zeroIndex < nums.length && nonZeroIndex < nums.length){
                swap(nums, zeroIndex, nonZeroIndex);
            }
        }
    }


    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
