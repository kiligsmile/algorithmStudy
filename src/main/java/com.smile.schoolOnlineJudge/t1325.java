package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     n个数中最大的那个数在哪里？输出其位置，若有多个最大数则都要输出。

     输入

     第一行：n（ 3 <= n <= 10）
     第二行：空格隔开的n个数

     输出

     输出若干个数，表示最大数的位置（数与数之间用一个空格隔开）

     样例输入

     5
     1 2 6 3 6
     样例输出

     3 5
*/


public class t1325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        int max=-2147483648;
        int p=0;
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            if(a[i]>max){
                max=a[i];
                p=i;
            }
        }
        for (int i = 0; i <n ; i++) {
            if(a[i]==max){
                System.out.print(i+1+" ");
            }
        }
    }
}
