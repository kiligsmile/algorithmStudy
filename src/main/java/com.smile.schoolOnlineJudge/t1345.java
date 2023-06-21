package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     今天的英语课，王老师为了复习以前学过的单词，提高学生的学习兴趣，想出了一个主意：
     读入M组数据，其中每组数据有一个单词L（单词长度<=36个字符）和一个整数N（0<=N<=36），从该单词最末位开始逐位移到单词的开头，如果还没达到N值，则再从末位开始移动，直到达到N值为止，求移N位后的新单词。你能编程帮助贝贝最快完成任务吗？

     输入

     共有2*M+1行，第1行为M，第2行开始为具体数据，每一组数据有2行，第1行为字串L，第2行为N。

     输出

     共M行，每行为旋转后的字串。

     样例输入

     3
     computer
     3
     program
     1
     ABCDEFGH
     35
     样例输出

     tercompu
     mprogra
     FGHABCDE
*/

public class t1345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String str[]=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=scanner.next();
            int len=str[i].length();
            int num= (scanner.nextInt())%len;
            String tailSubString=str[i].substring(len-num);
            String headSubString=str[i].substring(0,len-num);
            System.out.println(tailSubString+headSubString);
        }
    }
}
