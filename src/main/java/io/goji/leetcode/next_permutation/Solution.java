package io.goji.leetcode.next_permutation;

public class Solution {


    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // find the first decreasing element
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        // find the first element that is greater than nums[i], starting from the end, and swap them
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // reverse the array from i + 1 to the end
        reverse(nums, i + 1);


    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



    // reverse the array from start to the end, inclusive
    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }


}
