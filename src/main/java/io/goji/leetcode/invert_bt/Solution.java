package io.goji.leetcode.invert_bt;

public class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) {
            return null;
        }
        if(root.left == null && root.right == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = left;
        return root;
    }
}
