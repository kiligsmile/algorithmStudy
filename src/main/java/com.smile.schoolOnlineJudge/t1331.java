package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     求出1000以内的整数，使其数字之和为13，每行输出8个数。
     例如：数85，其数字之和为8+5=13
     数373，其数字之和为3+7+3=13

     输入

     无

     输出

     所有符合条件的整数，每行8个，数与数之间用一个空格隔开。
*/


public class t1331 {
    boolean judge(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum==13){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t1331 e=new t1331();
        int count=0;
        for(int i=0;i<=1000;i++){
            if(e.judge(i)){
                if(count==7){
                    System.out.println(i);
                    count=0;
                }else{
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
    }
}
