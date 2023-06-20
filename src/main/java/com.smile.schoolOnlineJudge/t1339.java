package com.smile.schoolOnlineJudge;

import java.util.LinkedList;
import java.util.Scanner;
/**
     题目描述

     神舟号飞船在完成宇宙探险任务回到地球后，宇航员张三感觉身体不太舒服，去了医院检查，医生诊断结果：张三体内基因已被改变，原有人体基因序列中已经被渗入外星球不明异形生物基因，但可喜的是，这些异形基因都有一个共同的特征，就是该基因序号的平方除以7的余数都是1，要赶快清除掉，否则会危害整个人类。赶快行动吧。

     输入

     第一行是一个整数n（基因个数）
     第二行是n个整数（张三的基因序列）

     输出

     去除异形基因后的正常序列，空格隔开

     样例输入

     4
     6 2 8 12
     样例输出

     2 12
*/


public class t1339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int num= scanner.nextInt();
            if((num*num)%7!=1){
                list.add(num);
            }
        }
        for (int i : list) {
            System.out.print(i+" ");
        }
    }
}
