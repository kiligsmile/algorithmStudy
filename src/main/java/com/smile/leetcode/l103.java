package com.smile.leetcode;

import java.util.*;


public class l103 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ans=new LinkedList<List<Integer>>();
            if(root==null){
                return ans;
            }
            Queue<TreeNode> node=new ArrayDeque<TreeNode>();
            node.offer(root);
            boolean isOrderLeft=true;
            while(!node.isEmpty()){
                Deque<Integer> levelList=new LinkedList<Integer>();
                int size=node.size();
                for(int i=0;i<size;i++){
                    TreeNode curnode=node.poll();
                    if(isOrderLeft){
                        levelList.offerLast(curnode.val);
                    }else{
                        levelList.offerFirst(curnode.val);
                    }
                    if(curnode.left!=null){
                        node.offer(curnode.left);
                    }
                    if(curnode.right!=null){
                        node.offer(curnode.right);
                    }
                }
                ans.add(new LinkedList<Integer>(levelList));
                isOrderLeft=!isOrderLeft;
            }
            return ans;
        }
    }

}
