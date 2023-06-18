package com.smile.schoolOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;
/**
     题目描述

     N个小朋友在一起做游戏。
     每个小朋友在自己的硬纸板上写一个数，然后同时举起来。
     接着，小y老师提一个问题，看哪个小朋友先抢答出来。
     问题是：在这N个数中，第K大的是哪个数？请你编程完成。

     输入

     输入的第一行为2个整数，依次为N和K( K <= N <= 10000 )。
     下面N行，每行为一个整数，表示从第1个小朋友到第N个朋友分别写的数。假设这些小朋友只知道-32768~32767之间的数。

     输出

     输出只有一行，就一个数，为第K大的那个数。

     样例输入

     4 3
     1
     2
     2
     4
     样例输出

     2
*/


public class t1329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k=scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n-k]);
    }
}
