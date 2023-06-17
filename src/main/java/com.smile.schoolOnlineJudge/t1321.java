package com.smile.schoolOnlineJudge;

/* 题目描述

        对输入的一句子实现查找且置换的功能（找到某个子串并换成另一子串）。

        输入

        第一行为原来的字符串
        第二行为要查找的子串
        第三行为要替换成的子串

        输出

        只有一行，为替换好的字符串

        样例输入

        abcf  abdabc
        abc
        AA
        样例输出

        AAf  abdAA
 */
import java.util.Scanner;

public class t1321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        String s3=scanner.nextLine();
        System.out.println(s1.replace(s2,s3));

    }
}
