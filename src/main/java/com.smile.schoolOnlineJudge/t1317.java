package com.smile.schoolOnlineJudge;

/**
 题目描述

 甲、乙、丙三人共有384本书，先由甲分给乙、丙，所给书数分别等于乙、丙已有的书数，再由乙分给甲、丙，最后由丙分给甲、乙，分法同前，结果三人图书数相等。编程求甲、乙、丙三人原各有书多少本？
 输入

 无
 输出

 甲的书数 乙的书数 丙的书数 (每个数间一个空格隔开)
*/


public class t1317 {
    public static void main(String[] args) {
        int fact=0;
        for(int i=0;i<=384;i++){
            for(int j=0;(i+j)<=384;j++){
                int x=i;  // 注意此语句的放置顺序
                int y=j;
                int z=(384-i-j);
                int k=z;
                x-=(y+z);
                y=y+y;
                z=z+z;
                y-=(x+z);
                x=x+x;
                z=z+z;
                z-=(x+y);
                y=y+y;
                x=x+x;
                if(x==y&&y==z){
                    System.out.println(i+" "+j+" "+k);
                    fact=1;
                    break;
                }
            }
            if(fact==1){
                break;
            }
        }
    }
}
