package com.smile.study;

public class path {
//    从(0,0)到（m,n）有多少种路径
    public static void main(String[] args) {
        int m=2,n=3;
        System.out.println(result(m,n));
    }
    static int result(int m, int n){
        if(m==0&&n==0){
            return  0;
        }
        if(m==0||n==0){
            return 1;
        }
        return result(m-1,n)+result(m,n-1);
    }
}

