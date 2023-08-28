package com.smile.jzOffer;
/**
 剑指 Offer 06. 从尾到头打印链表

 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 示例 1：

 输入：head = [1,3,2]
 输出：[2,3,1]
*/


 class ListNode {
     int val;
     ListNode next;
     ListNode(int x, ListNode head) {
         val = x;
     }
}
public class offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode node=head;
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        int num[]=new int[count];
        node=head;
        for(int i=count-1;i>=0;i--){
            num[i]=node.val;
            node=node.next;
        }
        return num;
    }
}
