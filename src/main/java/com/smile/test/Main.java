package com.smile.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        //     System.out.println("b vs x");
        //     System.out.println("c vs y");
        //     System.out.println("a vs z");
        // }
        char i, j, k;
        for (i = 'x'; i <= 'z'; i++) {
            for (j = 'x'; j <= 'z'; j++) {
                if (i != j) {
                    for (k = 'x'; k <= 'z'; k++) {
                        if (i != k && j != k) {
                            if (i != 'x' && k != 'x' && k != 'z') {
                                System.out.println("a vs "+i);
                                System.out.println("b vs "+j);
                                System.out.println("c vs "+k);
                            }
                        }
                    }
                }
            }
        }

        // System.out.println("aVSz");
        // System.out.println("bVSx");
        // System.out.println("cVSy");
    }
}