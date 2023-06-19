package com.smile.schoolOnlineJudge;
import java.util.Scanner;
/**
     题目描述

     有一组数（设有N个）。编一程序交换这组数中任意指定的两段。

     输入

     一个数N（不超过20个）
     一行N个数由空格分开
     两个空格分开的数（表示要交换的其中一段）
     两个空格分开的数（表示要交换的其中另一段）

     输出

     交换后的一行数（中间用空格隔开）

     样例输入

     16
     3 6 11 45 23 70 67 34 26 89 90 15 56 50 20 10
     3 5
     13 15
     样例输出

     3 6 56 50 20 70 67 34 26 89 90 15 11 45 23 10
*/


public class t1334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n+1];
        for (int i = 1; i <=n; i++) {
            a[i]=scanner.nextInt();
        }
        int L1=scanner.nextInt();
        int R1=scanner.nextInt();
        int L2=scanner.nextInt();
        int R2=scanner.nextInt();
        // 创建一个临时数组来保存交换的段
        int[] temp = new int[(R1-L1)+1];

        // 复制要交换的段到临时数组
        System.arraycopy(a,L1,temp,0,(R1-L1)+1);
        System.arraycopy(a,L2,a,L1,(R2-L2)+1);
        System.arraycopy(temp,0,a,L2,(R1-L1)+1);
        for (int i = 1; i <n ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print(a[n]);
    }
}
