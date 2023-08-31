package com.smile.test;

public class test01 {
    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(1);
        Integer c = new Integer(1);
        Integer d = Integer.valueOf(1);
        Long e = new Long(1);
        Long f = Long.valueOf(1);

//        assert a == b;
//        assert b != c;
//        assert b != d;
//        assert a == d;
//        assert a == e;
//        assert a == f;
//        assert b.equals(c);
//        assert !b.equals(e);
        System.out.println(a == b);
        System.out.println(b != c);
        System.out.println(b != d);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(a == f);
        System.out.println(b.equals(c));
        System.out.println(!b.equals(e));
    }

}
