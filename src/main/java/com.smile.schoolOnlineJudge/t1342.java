package com.smile.schoolOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;
/**
     题目描述

     兔子小白是位数学爱好者，有一次它参加了兔界里的数学比赛，成绩公布后，小白很想知道自己的成绩到底排第几，现在请你帮它编一个程序，要求输入一个成绩，就能知道相应的名次。注意：同分的按相同名次算，且只算一次。

     输入

     输入共三行。
     第一行：一个整数n（n<=30000）
     第二行：n个正整数（这些数不大于1000）。
     第三行：一个整数，需要查询的分数。

     输出

     输出共一行。一个整数，查询成绩的名次。

     样例输入

     7
     30 50 80 60 20 50 60
     50
     样例输出

     3
*/

//注意排名应该是分数从大到小，且题目说：同分的按相同名次算，且只算一次。
public class t1342 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[n];
        int count=1;
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        int num= scanner.nextInt();
        if(num!=a[n-1]){
            for (int i = n-2; i >=0; i--) {
                if(a[i]!=a[i+1]) {
                    count++;
                }
                if(a[i]==num){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
