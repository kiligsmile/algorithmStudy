package com.smile.leetcode;

import java.util.ArrayList;
import java.util.List;

public class l235 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            List<TreeNode> pathp=getPath(root,p);
            List<TreeNode> pathq=getPath(root,q);
            TreeNode ancestor=null;
            for(int i=0;i<pathp.size()&&i<pathq.size();i++){
                if(pathp.get(i)==pathq.get(i)){
                    ancestor=pathp.get(i);
                }else{
                    break;
                }
            }
            return ancestor;
        }
        public List<TreeNode> getPath(TreeNode root,TreeNode target){
            List<TreeNode> path=new ArrayList<TreeNode>();
            TreeNode node=root;
            while(node!=target){
                path.add(node);
                if(node.val>target.val){
                    node=node.left;
                }else{
                    node=node.right;
                }
            }
            path.add(target);
            return path;
        }

        public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode ancestor=root;
            while(true){
                if(p.val<ancestor.val&&q.val<ancestor.val){
                    ancestor=ancestor.left;
                }else if(p.val>ancestor.val&&q.val>ancestor.val){
                    ancestor=ancestor.right;
                }else{
                    break;
                }
            }
            return ancestor;
        }
    }
}
