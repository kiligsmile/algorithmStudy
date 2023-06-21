package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     赛马是一项古老的运行，我们都听说过"田忌赛马"的故事。现在有甲、乙两队各出n（编号为1..n）匹赛马进行一对一的n场比赛，由于赛马的出场顺序是赛前安排且不让对方知道的，所以两队只能决定自己马匹的上场顺序而不能根据对方的顺序来调整自己的策略。假设每匹马都有恒定的速度，所以速度大的马一定比速度小的马先到终点（没有意外！！），速度相等的马算同时到达终点（平局）。现给出两队赛马的速度及出场顺序，试计算出甲队胜、平、负的场次数。

     输入

     第1行：一个整数n（0 < n < = 20000）。
     第2行：n个整数，表示编号从1..n的甲队各匹马的速度（0 < 每个整数 < 1000）。
     第3行：n个整数，表示编号从1..n的乙队各匹马的速度（0 < 每个整数 < 1000）。
     第4行：n个整数，表示甲队马匹的出场顺序（0 < 每个整数 <= n）。
     第5行：n个整数，表示乙队马匹的出场顺序（0 < 每个整数 <= n）。

     输出

     一行：空格隔开的3个整数，分别表示甲队胜、平、负的场数。

     样例输入

     5
     1 3 8 2 2
     2 4 8 3 2
     1 3 2 4 5
     3 2 1 4 5
     样例输出

     2 1 2
*/



public class t1343 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int a[][]=new int[n][2];
        int b[][]=new int[n][2];
        int m[]=new int[n];
        int k[]=new int[n];
        int win,lose,ave;
        win=lose=ave=0;
        for (int i = 0; i < n; i++) {
            m[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            k[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num=scanner.nextInt();
            a[num-1][0]=m[i];
        }
        for (int i = 0; i < n; i++) {
            int num=scanner.nextInt();
            b[num-1][0]=k[i];
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i][0]+" ");
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(b[i][0]+" ");
//        }
        for (int i = 0; i < n; i++) {
            if(a[i][0]>b[i][0]){
                win++;
            }
            if(a[i][0]==b[i][0]){
                ave++;
            }
            if(a[i][0]< b[i][0]){
                lose++;
            }
        }
        System.out.println(win+" "+ave+" "+lose);
    }
}
