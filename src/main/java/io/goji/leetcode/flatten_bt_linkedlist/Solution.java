package io.goji.leetcode.flatten_bt_linkedlist;



public class Solution {


    public void flatten(TreeNode root) {
        flatten(root, null);

    }



    ////TreeNode object representing the current node being processed,and another TreeNode object representing the previously processed node.
    TreeNode flatten(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }

        ///region After the recursive calls,the method sets the right child of the current node to the previously processed node and the left child to null
        prev = flatten(root.right, prev);
        prev = flatten(root.left, prev);
        root.right = prev;
        root.left = null;
        ///endregion

        //, the method returns the previously processed node, which will be used in the next recursive call or returned to the caller if the recursion has ended.
        prev = root;
        return prev;
    }
}
