package com.smile.exam.meituan4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class t5 {
    public class Main {
        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n = in.nextInt();
                Set<Integer> eat=new HashSet<>();
                int day=0;
                int nums[]=new int[n];
                for(int i=0;i<n;i++){
                    nums[i]=in.nextInt();
                }
                for(int i=1;i<n;i++){
                    if(!eat.contains(nums[i-1])&&!eat.contains(nums[i])){
                        eat.add(nums[i-1]);
                        eat.add(nums[i]);
                        day++;
                    }
                }
                System.out.println(n/2);
            }
        }
    }
}
