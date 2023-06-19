package com.smile.schoolOnlineJudge;

import java.util.LinkedList;
import java.util.Scanner;

//class LinkNode{
//    public int val;
//    public LinkNode next;
//    public LinkNode(int val,LinkNode next){
//        this.val=val;
//        this.next=next;
//    }
//}
public class t1336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        LinkedList<Integer> lists=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            lists.add(scanner.nextInt());
        }
        System.out.println();
        for(int i:lists) {
            System.out.println(i);
        }

    }
}
