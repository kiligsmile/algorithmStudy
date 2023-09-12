package com.smile.leetcode;

public class l21 {
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

//    合并两个排序的链表
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1==null||l2==null){
                return l1!=null?l1:l2;
            }
            ListNode head = new ListNode(0);
            ListNode tail = head, aPtr = l1, bPtr = l2;
            while (aPtr != null && bPtr != null) {
                if (aPtr.val < bPtr.val) {
                    tail.next = aPtr;
                    aPtr = aPtr.next;
                } else {
                    tail.next = bPtr;
                    bPtr = bPtr.next;
                }
                tail = tail.next;
            }
            tail.next = (aPtr != null ? aPtr : bPtr);
            return head.next;
        }
    }
}
