package com.smile.leetcode.jzOffer;

//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class l2130 {
    public int pairSum(ListNode head) {
        ListNode header=new ListNode(0,head);
        ListNode p1=header;
        ListNode p2=header.next;
        int count=0;
        while(p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            count++;
        }
        ListNode rever=null;
        ListNode p=p1.next;
        while(p!=null){
            rever=new ListNode(p.val,rever);
            p=p.next;
        }
        int max=0;
        p=head;
        while(count>0){
            count--;
            int sum=rever.val+p.val;
            rever=rever.next;
            p=p.next;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
