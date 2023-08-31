package com.smile.leetcode;

import java.util.HashMap;
import java.util.Map;

public class l337 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Solution {
        Map<TreeNode,Integer> f=new HashMap<TreeNode,Integer>();
        Map<TreeNode,Integer> g=new HashMap<TreeNode,Integer>();
        public int rob(TreeNode root) {
            dfs(root);
            return Math.max(f.getOrDefault(root,0),g.getOrDefault(root,0));
        }
        public void dfs(TreeNode node){
            if(node==null){
                return;
            }
            dfs(node.left);
            dfs(node.right);
            f.put(node,node.val+g.getOrDefault(node.left,0)+g.getOrDefault(node.right,0));
            g.put(node,Math.max(f.getOrDefault(node.left,0),g.getOrDefault(node.left,0))+Math.max(f.getOrDefault(node.right,0),g.getOrDefault(node.right,0)));
        }
    }

    class Solution2 {
        public int rob(TreeNode root) {
            int[] rootStatus=dfs(root);
            return Math.max(rootStatus[0],rootStatus[1]);
        }
        public int[] dfs(TreeNode node){
            if(node==null){
                return new int[]{0,0};
            }
            int[] l=dfs(node.left);
            int [] r=dfs(node.right);
            int selected=node.val+l[1]+r[1];
            int notSelected=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
            return new int[]{selected,notSelected};
        }
    }
}
