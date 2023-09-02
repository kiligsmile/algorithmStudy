package com.smile.exam.meituan4;

import java.util.Scanner;

public class t4 {
    public class Main {
        public  void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int n = in.nextInt();
                int k = in.nextInt();
                int nums[]=new int[n];
                for(int i=0;i<n;i++){
                    nums[i]=in.nextInt();
                }
                boolean[] removed=new boolean[n];
                int result=backstrack(nums,k,removed,0);
                System.out.println(result);
            }
        }
        public  int backstrack(int[] nums,int k,boolean[]removed,int index){
            if(k==0){
                if(ifValid(nums,removed)){
                    return 1;
                }
                return 0;
            }
            int count=0;
            for(int i=index;i<nums.length;i++){
                if(!removed[i]){
                    removed[i]=true;
                    count+=(backstrack(nums,k-1,removed,i+1)%(1000000007));
                    removed[i]=false;
                }
            }
            return count%(1000000007);
        }

        public  boolean ifValid(int []nums,boolean[] removed){
            for(int i=0;i<nums.length;i++){
                if(!removed[i]){
                    for(int j=i+1;j<nums.length;j++){
                        if(!removed[j]&&nums[j]%nums[i]!=0&&nums[i]%nums[j]!=0){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
