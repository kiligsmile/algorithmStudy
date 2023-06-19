package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     有50个数（0-19），求这50个数中相同数字出现的最多次数为几次？
     输入

     50个数字
     输出

     1个数字（即相同数字出现的最多次数）
     样例输入

     1 10 2 0 15 8 12 7 0 3 15 0 15 18 16 7 17 16 9 1 19 16 12 17 12 4 3 11 1 14 2 11 14 6 11 4 6 4 11 13 18 7 0 3 2 3 18 19 2 16
     样例输出

     4
*/


public class t1333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[20];
        int count;
        for (int i = 0; i < 50; i++) {
            int num= scanner.nextInt();
            count=a[num];
            count++;
            a[num]=count;
        }
        int max=0;
        for (int i = 0; i < 20; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
