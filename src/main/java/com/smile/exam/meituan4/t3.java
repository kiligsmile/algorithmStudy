package com.smile.exam.meituan4;

import java.util.Scanner;

public class t3 {
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
                int max=Integer.MIN_VALUE;
                for(int num:a){
                    max=Math.max(max,num);
                }
                int maxn=getMax(a,max);
                System.out.println(maxn);
            }
        }
        public  int getMax(int[] nums,int target){
            if(target==nums[0]){
                return 0;
            }
            int count=0;
            while(target>nums[0]){
                target/=2;
                count++;
            }
            return count;
        }
    }
}
