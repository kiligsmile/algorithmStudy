package com.smile.leetcode;

public class l643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int minx=Integer.MIN_VALUE;
            int sum=0;
            int maxn;
            int len=nums.length;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            maxn=sum;
            for(int i=k;i<len;i++){
                sum-=nums[i-k];
                sum+=nums[i];
                if(sum>maxn){
                    maxn=sum;
                }
            }
            return maxn*1.0/k;
        }
    }
}
