package com.smile.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class l129 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){this.val=val;}
        TreeNode(int val,TreeNode left,TreeNode right){this.val=val;this.left=left;this.right=right;}
    }
    class Solution {
        public int sumNumbers(TreeNode root) {
            return dfs(root,0);
        }
        int dfs(TreeNode root,int pre){
            if(root==null){
                return 0;
            }
            int sum=pre*10+root.val;
            if(root.left==null&&root.right==null){
                return sum;
            }else{
                return dfs(root.left,sum)+dfs(root.right,sum);
            }
        }
    }

    class Solution2 {
        public int sumNumbers(TreeNode root) {
            if(root==null){
                return 0;
            }
            int sum=0;
            Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
            Queue<Integer> numQueue = new LinkedList<Integer>();
            nodeQueue.offer(root);
            numQueue.offer(root.val);
            while(!nodeQueue.isEmpty()){
                TreeNode node=nodeQueue.poll();
                int num=numQueue.poll();
                TreeNode left=node.left,right=node.right;
                if(left==null&&right==null){
                    sum+=num;
                }else{
                    if(left!=null){
                        nodeQueue.offer(left);
                        numQueue.offer(num*10+left.val);
                    }
                    if(right!=null){
                        nodeQueue.offer(right);
                        numQueue.offer(num*10+right.val);
                    }
                }
            }
            return sum;
        }
    }
}
