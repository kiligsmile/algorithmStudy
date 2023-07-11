package com.smile.leetcode.jzOffer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class l1448 {
    int num=0;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return num;
        }
        dfs(root,root.val);
        return num;
    }
    void dfs(TreeNode node, int max){
        if(node==null){
            return;
        }
        if(node.val>=max){
            num++;
            max=node.val;
        }
        dfs(node.left,max);
        dfs(node.right,max);
    }
}
