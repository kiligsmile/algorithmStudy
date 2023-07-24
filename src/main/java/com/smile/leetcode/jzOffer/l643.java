package com.smile.leetcode.jzOffer;

public class l643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int max=0;
            int len=nums.length;
            int result[]=new int[len];
            for(int i=0;i<k;i++){
                max+=nums[i];
            }
            result[k-1]=max;
            for(int i=k;i<len;i++){
                int a=result[i-1]-nums[i-k];
                int b=a+nums[i];
                result[i]=b;

            }
            max=result[k-1];
            for(int i=k-1;i<len;i++){
                if(max>result[i]){
                    max=result[i];
                }
            }
            double re=max*1.0/k;
            return re;
        }
    }
}
