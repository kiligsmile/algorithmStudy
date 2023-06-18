package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     郭远有一天走到了一片苹果林，里面每颗树上都结有不同数目的苹果，郭远身上只能拿同一棵树上的苹果，他每到一棵果树前都会把自己身上的苹果扔掉并摘下他所在树上的苹果并带走（假设郭远会走过每一棵苹果树），问在郭远摘苹果的整个过程中，他身上携带的最多苹果数与最小苹果数的差是多少？

     输入

     m，n（即苹果林中有果树的行数和列数）
     m行n列数据（即每颗树上的苹果数）

     输出

     1个数字（郭远摘苹果的整个过程中，他身上携带的最多苹果数与最小苹果数的差）

     样例输入

     4 3
     2 6 5
     1 3 7
     5 3 5
     1 7 12
     样例输出

     11
*/


public class t1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k=scanner.nextInt();
        int a[]=new int[n*k];
        int min=2147483647;
        int max=-2147483648;
        for (int i = 0; i < n*k; i++) {
            a[i]=scanner.nextInt();
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print(max-min);
    }
}
