package com.smile.leetcode;

public class l2560 {
    class Solution {
        public int minCapability(int[] nums, int k) {
            int left=0,right=Integer.MAX_VALUE;
            while(left+1<right){
                int mid=(left+right)>>>1;
                int f0=0,f1=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]>mid){
                        f0=f1;
                    }else{
                        int tmp=f1;
                        f1=Math.max(f1,f0+1);
                        f0=tmp;
                    }
                }
                if(f1>=k){
                    right=mid;
                }else{
                    left=mid;
                }
            }
            return right;
        }
    }
}
