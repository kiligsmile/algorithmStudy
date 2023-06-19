package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     输入一个三位正整数，然后与它倒过来的数相加，输出和。
     如：输入167，则和为167+761=928

     输入

     只有一行，一个三位正整数。

     输出

     一个正整数

     样例输入

     167
     样例输出

     928
*/


public class t1335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String s= String.valueOf(sb.reverse());
        System.out.print(n+Integer.valueOf(s));
    }
}
