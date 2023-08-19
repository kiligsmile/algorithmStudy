package com.smile.study;

public class test {
    void test(){
        Integer a = new Integer(10);
        Integer b = a; // b 是 a 的引用，指向同一个对象
        a = new Integer(20);
        okm:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) {
                    break okm;
                }

            }
        }



    }
}
