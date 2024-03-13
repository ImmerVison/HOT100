package io.goji.leetcode.sort_colors;

class Solution {
    public void sortColors(int[] nums) {
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
