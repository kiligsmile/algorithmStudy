package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     在已知一组整数中，有这样一种数非常怪，它们不在第一个，也不在最后一个，而且刚好都比左边和右边相邻的数大，你能找到它们吗？每行输出5项。

     输入

     第一行为整数m，表示输入的整数个数。（ 3<= m <=100 )
     第二行为m个整数。

     输出

     若干个支撑数

     样例输入

     14
     1 3 2 4 1 5 3 9 7 10 8 23 85 43
     样例输出

     3 4 5 9 10
     85
*/
public class t1338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m=scanner.nextInt();
        int count=0;
        int a[]=new int[m];
        for (int i = 0; i < m; i++) {
            a[i]=scanner.nextInt();
        }
        for(int i=1;i<m-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                if(count<4){
                    System.out.print(a[i]+" ");
                    count++;
                }
                else{
                    System.out.println(a[i]);
                    count=0;
                }
            }
        }
    }
}
