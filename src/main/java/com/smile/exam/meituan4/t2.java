package com.smile.exam.meituan4;

import java.util.Scanner;

public class t2 {
    public class Main {
        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n = in.nextInt();
                int m = in.nextInt();
                String mb="meituan";
                String [] str=new String[n];
                String ch=in.nextLine();
                for(int i=0;i<n;i++){
                    str[i]=in.nextLine();
                }
                if(n<7){
                    System.out.println("NO");
                }else{
                    int j=0;
                    for(int i=0;i<n;i++){
                        if(j<=6&&str[i].contains(String.valueOf(mb.charAt(j)))){
                            j++;
                        }
                    }
                    if(j==7){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
