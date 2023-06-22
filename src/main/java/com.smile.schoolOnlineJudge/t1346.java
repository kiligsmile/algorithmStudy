package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     手机的键盘是这样的：
     1          2 abc 3 def
     4 ghi   5 jkl    6 mno
     7 pqrs 8 tuv  9 wxyz
     *           0        #
     要按出英文字母就必须要按数字键多下。例如要按出x就得按9两下，第一下会出w，而第二下会把w变成x。按0键一下会出一个空格。
     你的任务是读取一句只包含英文小写字母和空格的句子，求出要在手机上打出这个句子至少需要按多少下键盘。

     输入

     一行，一个句子，只包含英文小写字母和空格，且不超过200个字符。

     输出

     一个整数，表示按键盘的总次数。

     样例输入

     i have a dream
     样例输出

     23
*/


public class t1346 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][]=new int[26][1];
        a[0][0]=a[3][0]=a[6][0]=a[9][0]=a[12][0]=a[15][0]=a[19][0]=a[22][0]=1;
        a[1][0]=a[4][0]=a[7][0]=a[10][0]=a[13][0]=a[16][0]=a[20][0]=a[23][0]=2;
        a[2][0]=a[5][0]=a[8][0]=a[11][0]=a[14][0]=a[17][0]=a[21][0]=a[24][0]=3;
        a[18][0]=a[25][0]=4;
        String str= scanner.nextLine();
        int len=str.length();
        int count=0;
        for (int i = 0; i <len ; i++) {
            if(str.charAt(i)==' '){
                count+=1;
            }
            else{
                count+=a[str.charAt(i)-'a'][0];
            }
        }
        System.out.println(count);
    }
}
