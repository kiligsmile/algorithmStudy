package com.smile.leetcode;

import java.util.HashSet;
import java.util.Set;

public class l142 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode pos=head;
            Set<ListNode> visted=new HashSet<ListNode>();
            while(pos!=null){
                if(visted.contains(pos)){
                    return pos;
                }else{
                    visted.add(pos);
                }
                pos=pos.next;
            }
            return null;
        }
    }
}
