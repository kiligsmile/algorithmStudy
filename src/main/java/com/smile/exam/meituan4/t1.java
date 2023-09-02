package com.smile.exam.meituan4;

import java.util.Scanner;

public class t1 {
    public class Main {
        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n = in.nextInt();
                int a[]=new int [n];
                for(int i=0;i<n;i++){
                    a[i]=in.nextInt();
                }
                int fact=1;
                for(int i=1;i<n;i++){
                    if(a[i]<=a[i-1]){
                        System.out.println("No");
                        fact=0;
                        break;
                    }
                }
                if(fact==1){
                    for(int i=0;i<n-2;i++){
                        if((a[i+1]-a[i])<=(a[i+2]-a[i+1])){
                            System.out.println("No");
                            fact=0;
                            break;
                        }
                    }
                }
                if(fact==1){
                    System.out.println("Yes");
                }
            }
        }
    }
}
