package com.smile.schoolOnlineJudge;

import java.util.Scanner;
/**
     题目描述

     定义：一个词组中每个单词的首字母的大写组合称为该词组的缩写。
     比如，C语言里常用的EOF就是end of file的缩写。

     输入

     测试数据占一行，有一个词组，每个词组由一个或多个单词组成；每组的单词个数不超过10个，每个单词有一个或多个大写或小写字母组成；
     单词长度不超过10，由一个或多个空格分隔这些单词。

     输出

     输出规定的缩写

     样例输入

     end of file
     样例输出

     EOF
*/


public class t1340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
//        使用input.split("\\s+")来分割输入字符串，其中\\s+表示一个或多个空白字符（空格、制表符等）。这样，多个连续的空格会被视为一个分隔符。
        String words[]=s.split("\\s+");
        for (String word : words) {
            char firstLetter=word.charAt(0);
            sb.append(Character.toUpperCase(firstLetter));
        }
        System.out.println(sb.toString());
    }
}
