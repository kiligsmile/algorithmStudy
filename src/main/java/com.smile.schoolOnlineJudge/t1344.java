package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     由于小星同学上课不专心，今天老师布置了几道数学题目他不会解答了。怎么办呢？这下他可发愁了！请热心的你来帮帮他。
     题目是给你一组有规律序列的前面3个整数，请你给出它后面跟着的3个整数，如：1,2,4,___,___,___。这个是等比数列，后面应该是8,16,32。（等比数列可以简单理解为相邻两项的比值（商）一定）
     如果是1,2,3,___,___,___。这是个等差数列，后面应该是4,5,6。（等差数列可以简单理解为相邻两项的差值一定）现在小星已经知道这串序列要么是等比数列，要么是等差数列。

     输入

     输入一行：3个整数a1，a2，a3。（0 <= a1<=a2<=a3 <= 100）

     输出

     3个整数，之间用一个空格隔开。

     样例输入

     1 2 4
     样例输出

     8 16 32
     提示

     数据保证等比数列的相邻两项的比值（公比）为整数。
*/

public class t1344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        if((b-a)==(c-b)){
            int num=(b-a);
            a=c+num;
            b=a+num;
            c=b+num;
        }
        else{
            int num=(c/b);
            a=c*num;
            b=a*num;
            c=b*num;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
