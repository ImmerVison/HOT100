package io.goji.leetcode.combination_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, list, candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int start) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(result, list, candidates, target - candidates[i], i);
            list.remove(list.size() - 1);
        }
    }

}
