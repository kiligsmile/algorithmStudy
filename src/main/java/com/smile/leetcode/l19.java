package com.smile.leetcode;


import java.util.Deque;
import java.util.LinkedList;

public class l19 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.next=next;
        }
    }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy=new ListNode(0,head);
            int length=getLength(head);
            ListNode cur=dummy;
            for(int i=0;i<length-n;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
            return dummy.next;
        }

        int getLength(ListNode head){
            int length=0;
            while(head!=null){
                length++;
                head=head.next;
            }
            return length;
        }
    }

    class Solution2 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            Deque<ListNode> stack= new LinkedList<ListNode>();
            ListNode dummy=new ListNode(0,head);
            ListNode cur=dummy;
            while(cur!=null){
                stack.push(cur);
                cur=cur.next;
            }
            for(int i=0;i<n;i++){
                stack.pop();
            }
            ListNode pre=stack.peek();
            pre.next=pre.next.next;
            return dummy.next;
        }
    }

    class Solution3 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy=new ListNode(0,head);
            ListNode cu1=dummy;
            ListNode cu2=dummy;
            for(int i=0;i<=n;i++){
                cu1=cu1.next;
            }
            while(cu1!=null){
                cu1=cu1.next;
                cu2=cu2.next;
            }
            cu2.next=cu2.next.next;
            return dummy.next;
        }
    }
}
