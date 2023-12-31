package com.smile.leetcode;

import java.util.*;

public class l107 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ret=new ArrayList<List<Integer>>();
            if(root==null){
                return ret;
            }
            Queue<TreeNode> queue=new LinkedList<TreeNode>();
            queue.offer(root);
            while(!queue.isEmpty()){
                List<Integer> level=new ArrayList<Integer>();
                int currentLevelSize=queue.size();
                for(int i=1;i<=currentLevelSize;i++){
                    TreeNode node=queue.poll();
                    level.add(node.val);
                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }
                }
                ret.add(level);
            }
            Collections.reverse(ret);
            return ret;
        }
    }
}
