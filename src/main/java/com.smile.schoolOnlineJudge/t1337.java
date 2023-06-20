package com.smile.schoolOnlineJudge;

import java.util.LinkedList;
import java.util.Scanner;
/**
     题目描述

     做操的时间到了，小明和另外几个同学没有吸取上一次的教训，在教室思考讨论老师讲的一道题目（学习用功型），当他们想通这个题时，其他同学已经在操场上排好队了，他们快速来到操场，希望尽快找到以前排队的位置，准备做操，小明他们记得应该排在某学号同学的后面。你能不能来帮帮小明他们呢？

     输入

     输入（三行）：
     n m（现在队伍的长度<=50 待插入的同学人数<=10）
     n个同学的学号（5位整数）
     m组数据（每组2个，分别为 插入位置的学生学号 插入的学生学号）

     输出

     n+m个学号（插入后每个学生的学号）

     样例输入

     4 2
     34812 34123 23133 45831
     34123 23483 45831 83123
     样例输出

     34812 34123 23483 23133 45831 83123
*/


public class t1337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k=n;
        int m=scanner.nextInt();
        int a[][]=new int[m][2];
        LinkedList<Integer> lists=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            lists.add(num);
        }
        for (int i = 0; i < m; i++) {
            a[i][0]=scanner.nextInt();
            a[i][1]=scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                if(lists.get(j) ==a[i][0]){
                    lists.add(j+1,a[i][1]);
                    break;
                }
            }
            n++;
        }
        for(int i=0;i<(m+k-1);i++) {
            System.out.print(lists.get(i)+" ");
        }
        System.out.print(lists.get(k+m-1));
    }
}
