package com.smile.leetcode.jzOffer;

public class l700 {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }
            if (val == root.val) {
                return root;
            }
            return searchBST(val < root.val ? root.left : root.right, val);
        }
    }
}
