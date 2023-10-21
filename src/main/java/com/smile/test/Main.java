package com.smile.test;

import java.util.Scanner;

import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        //     System.out.println("b vs x");
        //     System.out.println("c vs y");
        //     System.out.println("a vs z");
        // }
//        char i, j, k;
//        for (i = 'x'; i <= 'z'; i++) {
//            for (j = 'x'; j <= 'z'; j++) {
//                if (i != j) {
//                    for (k = 'x'; k <= 'z'; k++) {
//                        if (i != k && j != k) {
//                            if (i != 'x' && k != 'x' && k != 'z') {
//                                System.out.println("a vs "+i);
//                                System.out.println("b vs "+j);
//                                System.out.println("c vs "+k);
//                            }
//                        }
//                    }
//                }
//            }
//        }
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] s=str.split(",");
        int year=Integer.parseInt(s[0]);
        int month=Integer.parseInt(s[1]);
        int day=Integer.parseInt(s[2]);
        int result=0;
        for(int i=0;i<month-1;i++){
            result+=days[i];
        }
        if((((year%4==0&&year%100==0)||year%400==0)&&month>2)){
            result++;
        }
        result+=day;
        System.out.println(result);
        // System.out.println("aVSz");
        // System.out.println("bVSx");
        // System.out.println("cVSy");
    }
}