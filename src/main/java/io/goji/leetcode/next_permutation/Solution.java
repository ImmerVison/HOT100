package io.goji.leetcode.next_permutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        ///TODO
        if(nums.length == 1) return;
        int minIdx = nums.length - 1, secondMinIdx = nums.length - 2;
        if(nums[secondMinIdx] < nums[minIdx]) {
            int temp = nums[secondMinIdx];
            nums[secondMinIdx] = nums[minIdx];
            nums[minIdx] = temp;
            return;
        }
        while (secondMinIdx >= 0) {
            if (nums[secondMinIdx] < nums[minIdx]) {
                int temp = nums[secondMinIdx];
                nums[secondMinIdx] = nums[minIdx];
                nums[minIdx] = temp;
                quickSort(nums, secondMinIdx + 1, nums.length - 1);
                return;
            }
            secondMinIdx--;
            if(secondMinIdx == -1) minIdx = minIdx - 1;
        }
        quickSort(nums, 0, nums.length - 1);

    }

    void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int p = nums[l + (r - l >> 1)], i = l - 1, j = r + 1;
        while (i < j) {
            do ++i; while (nums[i] < p);
            do --j; while (nums[j] > p);
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }
}
