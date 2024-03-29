package io.goji.leetcode.path_sum3;

public class Solution {
    public int pathSum(TreeNode root, Long targetSum) {

        if (root == null) {
            return 0;
        }

        return pathSumFrom(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int pathSumFrom(TreeNode node, Long targetSum) {
        if (node == null) {
            return 0;
        }

        return (node.val == targetSum ? 1 : 0) + pathSumFrom(node.left, targetSum - node.val) + pathSumFrom(node.right, targetSum - node.val);
    }



}
