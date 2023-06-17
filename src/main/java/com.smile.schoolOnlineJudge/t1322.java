package com.smile.schoolOnlineJudge;

import java.util.Scanner;

/**
    题目描述

     给出一个正整数N（1≤N≤100），即可得到一个由N 个正整数组成的从1开始的如下数列：1，2，3，4，……N-2,N-1,N，且可求出从1开始的这N个数的全部各个数位上的数字之和。
     例如：当N=12时，这12个数是：1，2，3，4，5，6，7，8，9，10，11，12。
     则这12个数的数字之和为：
     S=1+2+3+4+5+6+7+8+9+1+0+1+1+1+2=51

     输入

     一个整数N。

     输出

     一个符合条件的整数。

     样例输入

     12
     样例输出

     51
*/


public class t1322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i==100){
                sum+=1;
            }else{
                sum+=i/10;
                sum+=i%10;
            }
        }
        System.out.println(sum);
    }
}
