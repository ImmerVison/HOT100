package io.goji.leetcode.subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, list, nums, 0);
        return result;

    }

    private void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list)); // 「遍历这个树的时候，把所有节点都记录下来，就是要求的子集集合」。
        if(start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }


}
