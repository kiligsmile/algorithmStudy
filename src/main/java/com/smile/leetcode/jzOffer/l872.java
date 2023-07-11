package com.smile.leetcode.jzOffer;

import java.util.ArrayList;
import java.util.List;

public class l872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        if(root1!=null){
            dfs(root1,list1);
        }
        if(root2!=null){
            dfs(root2,list2);
        }
        return list1.equals(list2);
    }

    public void dfs(TreeNode node, List<Integer> list){
        if(node.left==null&&node.right==null){
            list.add(node.val);
        }else{
            if(node.left!=null){
                dfs(node.left,list);
            }
            if(node.right!=null){
                dfs(node.right,list);
            }
        }
    }
}
