package io.goji.leetcode.validate_bst;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        int prev = result.get(0);
        for(int i = 1; i < result.size(); i++) {
            if(result.get(i) <= prev) {
                return false;
            }
            prev = result.get(i);
        }
        return true;

    }

    void inorder(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }



}
