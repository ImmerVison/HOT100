package io.goji.leetcode.construct_bt_pre_inorder;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preEnd || inStart >= inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inStart; i < inEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize = rootIndex - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + 1 + leftSize, inorder, inStart, rootIndex);
        root.right = buildTree(preorder, preStart + 1 + leftSize, preEnd, inorder, rootIndex + 1, inEnd);
        return root;
    }

}
