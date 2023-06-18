package com.smile.schoolOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;
/**
     题目描述

     判定三条线段a，b，c能否构成一个直角三角形。如果能构成，请计算出面积（保留一位小数），不然输出'No'。
     输入

     一行，三个整数。
     输出

     面积（保留一位小数） 或 No
     样例输入

     3 4 5
     样例输出

     6.0
*/


public class t1324 {
    public static void main(String[] args) {
        int a[]=new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        if(a[0]>0&&(a[0]+a[1])>a[2]&&(a[0]*a[0]+a[1]*a[1])==a[2]*a[2]){
            System.out.printf("%.1f",0.5*a[1]*a[0]);
        }
        else{
            System.out.print("No");
        }
    }
}
