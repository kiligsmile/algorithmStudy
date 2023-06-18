package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     花了一个多月的时间，Fish终于学会了比较两个数的大小。他想检测下自己是否已经真的学会了，找来了Bug考考他。Bug马上写出了n个数，要Fish数出每个数后面比他小的数的个数的总和，Fish马上开始数了起来。Bug自己也在旁边算，可他发现自己也还不太清楚，但又不想在Fish面前丢脸，所以来求助你，希望你能够在Fish面前算出标准答案。

     输入

     第一行：一个整数n(n<=300)。
     第2..n+1行：每行一个整数ai（ai<=32767)。

     输出

     一个数，每个数后面比他小的个数的总和。

     样例输入

     3
     3
     2
     1
     样例输出

     3
*/


public class t1332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int count=0;
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
