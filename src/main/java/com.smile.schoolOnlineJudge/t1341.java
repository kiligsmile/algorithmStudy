package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     游戏规则：输入两个单词(单词长度<=36个字符)，判断是否可以首尾拼接，前一单词尾部和后一单词首部有相同的字符串(大小写字母不分)才能拼接，如果可以拼接，输出"yes"，否则输出"no"。

     输入

     共两行，每行各为一个字符串。

     输出

     一行，拼接结果。

     样例输入

     apple
     Letter
     样例输出

     yes
*/


public class t1341 {
    public static String judge(String str1,String str2){
        int len=str1.length();
        for (int i = 1; i <=len; i++) {
//            从右边开始取i个字符
            String tailSubString=str1.substring(len-i);
            /*
                startsWith() 方法用于检测字符串是否以指定的前缀开始。
                如：String Str = new String("www.runoob.com");
                System.out.println(Str.startsWith("www") );
                返回值为true
             */
            if(str2.startsWith(tailSubString)){
                return "yes";
            }
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1= scanner.next().toLowerCase();
        String str2= scanner.next().toLowerCase();
        System.out.println(judge(str1,str2));
    }
}
