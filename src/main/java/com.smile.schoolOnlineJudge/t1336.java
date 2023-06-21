package com.smile.schoolOnlineJudge;

import java.util.LinkedList;
import java.util.Scanner;
/**
     题目描述

     做操的时间到了，小明在教室还在思考刚刚老师讲的一道题目，当他想通这个题时，同学们都已经在操场上排好队了，他赶快跑到操场上找到自己的班级队伍，希望尽快找到以前排队的位置，准备做操，小明记得应该排在第x学号同学的后面。你能不能来帮帮小明呢？

     输入

     输入（两行）：
     n x y（现在队伍的长度、第x同学的学号、小明的学号）
     n个同学的学号（5位整数）

     输出

     n+1个学号（小明加入队伍后队伍中的每个数据）

     样例输入

     4 34123 23483
     34812 34123 23133 45831
     样例输出

     34812 34123 23483 23133 45831

*/


public class t1336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int x= scanner.nextInt();
        int m= scanner.nextInt();
        int index=0;
        LinkedList<Integer> lists=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            lists.add(num);
            if(num==x){
                index=i;
            }
        }
        lists.add(index+1,m);
        for(int i:lists) {
            System.out.print(i+" ");
        }
    }
}
