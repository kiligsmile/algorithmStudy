package com.smile.schoolOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;

/**
     题目描述
     《贫民窟的百万富翁》获得2009年美国奥斯卡最佳影片，影片的主人公是一个叫贾马尔的小男孩，他在贫民窟长大，后来他参加了一档印度版的《谁想成为百万富翁》电视直播节目，他的特殊成长经历居然使他能够回答这个节目中的每一个问题，最后成功获得百万奖金。其中有一个题目是这样的：读入四个整数（0＜每个整数＜50000），判断这四个整数能否构成连续的四个奇数，如果可以就输出三行，每行一个等式，每个等式都满足"前一个数+2=后一个数"，否则请将这四个整数从大到小输出（数据之间以一个空格隔开）。

     输入
     一行，四个空格隔开的整数。（ 0 < 每个整数 < 50000 )

     输出
     三行，每行一个等式 或
     一行，从大到小排列的4个数

     样例输入
     17 13 11 15

     样例输出
     11+2=13
     13+2=15
     15+2=17
*/

public class t1323 {
    public static void main(String[] args) {
        int a[]=new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++){
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        if(a[0]%2!=0&&a[1]==(a[0]+2)&&a[2]==(a[1]+2)&&a[3]==(a[2]+2)){
            for(int i=0;i<2;i++){
                System.out.println(a[i]+"+2"+"="+a[i+1]);
            }
            System.out.println(a[2]+"+2"+"="+a[3]);
        }else{
            System.out.println(a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
        }
    }
}
