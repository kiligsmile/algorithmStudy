package com.smile.jzOffer;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//    给你一个链表的头节点 head 。删除 链表的 中间节点 ，并返回修改后的链表的头节点 head 。
//
//    长度为 n 链表的中间节点是从头数起第 ⌊n / 2⌋ 个节点（下标从 0 开始），其中 ⌊x⌋ 表示小于或等于 x 的最大整数。
//
//    对于 n = 1、2、3、4 和 5 的情况，中间节点的下标分别是 0、1、1、2 和 2 。
//
//    示例 ：
//    输入：head = [1,2,3,4]
//    输出：[1,2,4]

/*
快慢指针
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode myHeader = new ListNode(0, head); // 哨兵
        ListNode p1 = myHeader;
        ListNode p2 = myHeader.next;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p1.next = p1.next.next;
        return myHeader.next;
    }
}
*/

public class l2095 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        int len=count;
        int mid=count/2;
        p=head;
        count=0;
        if(mid==0){
            head=null;
        }
        else{
            while(count!=mid-1){
                count++;
                p=p.next;
            }
        }
        if(len>2){
            p.next=p.next.next;
        }
        else{
            p.next=null;
        }
        return head;
    }
}
